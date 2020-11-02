package com.cdac.dao;

import java.util.Base64;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.cdac.dto.User;

@Component
public class UserDaoImple implements IUserDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void insertUser(User user) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				org.hibernate.Transaction tr = session.beginTransaction();

				String encryptedPass = getEncryptPass(user.getUserPass());
				user.setUserPass(encryptedPass);
				session.save(user);
				tr.commit();
				session.flush();
				session.clear();

				return null;
			}
		});

	}

	protected String getEncryptPass(String userPass) {
		return Base64.getEncoder().encodeToString(userPass.getBytes());
	}

	@Override
	public boolean checkUser(User user) {
		boolean b = hibernateTemplate.execute(new HibernateCallback<Boolean>() {

			@Override
			public Boolean doInHibernate(Session session) throws HibernateException {

				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from User where user_name =?");
				q.setString(0, user.getUserName());
				boolean flag = false;
				List<User> li = q.list();
				if (!li.isEmpty()) {
					User newUser = li.get(0);
					String decryptedPass = getDecryptPass1(newUser.getUserPass());
					System.out.println(decryptedPass + " 62");
					if (user.getUserPass().equalsIgnoreCase(decryptedPass)) {
						flag = true;
						user.setUserId(li.get(0).getUserId());
						tr.commit();
						session.flush();
						session.close();
					}
				}
				return flag;

			}
		});

		return b;
	}

	protected String getDecryptPass1(String userPass) {

		return new String(Base64.getMimeDecoder().decode(userPass));
	}

	@Override
	public boolean checkAdmin(User user) {
		boolean b = hibernateTemplate.execute(new HibernateCallback<Boolean>() {

			@Override
			public Boolean doInHibernate(Session session) throws HibernateException {
				System.out.println("@@Beagin Transaction");
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from User where user_name =?");
				q.setString(0, user.getUserName());

				boolean flag = false;
				System.out.println(user);
				List<User> li = q.list();
				User dbUser = li.get(0);
				System.out.println(dbUser + " 97");
				user.setUserId(dbUser.getUserId());
				tr.commit();
				if (!li.isEmpty()) {
					System.out.println("list not empty");
					String decryptedPass = getDecryptPass(dbUser.getUserPass());
					System.out.println(decryptedPass + " de 105");
					if (user.getUserPass().equalsIgnoreCase(decryptedPass)
							&& user.getUserName().equalsIgnoreCase("admin")) {
						flag = true;
						System.out.println("Admin Comfirem");
					}
				}
				session.flush();
				session.close();
				System.out.println(flag + " flag return");
				return flag;

			}
		});
		System.out.println(b);
		return b;
	}

	protected String getDecryptPass(String userPass) {
		return new String(Base64.getMimeDecoder().decode(userPass));
	}

}

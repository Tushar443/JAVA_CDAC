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
				boolean flag = false;
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from User where user_name =?");
				q.setString(0, user.getUserName());

				List<User> li = q.list();
				if (!li.isEmpty()) {
					User newUser = li.get(0);
					String decryptedPass = getDecryptPass(newUser.getUserPass());
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

	protected String getDecryptPass(String userPass) {

		return new String(Base64.getMimeDecoder().decode(userPass));
	}

}

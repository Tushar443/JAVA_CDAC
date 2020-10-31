package com.cdac.dao;

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
				session.save(user);
				tr.commit();
				session.flush();
				session.clear();

				return null;
			}
		});

	}

	@Override
	public boolean checkUser(User user) {
		boolean b = hibernateTemplate.execute(new HibernateCallback<Boolean>() {

			@Override
			public Boolean doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from User where user_name =? and user_pass=?");
				q.setString(0, user.getUserName());
				q.setString(1, user.getUserPass());
				List<User> li = q.list();
				boolean flag = !li.isEmpty();
				user.setUserId(li.get(0).getUserId());
				tr.commit();
				session.flush();
				session.close();
				return flag;
			}
		});
		return b;
	}

}

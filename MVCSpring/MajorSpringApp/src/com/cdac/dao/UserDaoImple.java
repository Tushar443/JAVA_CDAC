package com.cdac.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
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

}

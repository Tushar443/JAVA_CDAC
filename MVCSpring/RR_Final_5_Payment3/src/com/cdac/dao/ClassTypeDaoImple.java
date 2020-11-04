package com.cdac.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cdac.dto.ClassType;

@Repository
public class ClassTypeDaoImple implements IClassType {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public double getPriceofClass(String className, int trainId) {
		double price = hibernateTemplate.execute(new HibernateCallback<Double>() {

			@Override
			public Double doInHibernate(Session session) throws HibernateException {
				System.out.println("class Name " + className + " " + trainId);
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from ClassType where train_id =? and class_name=?");
				q.setInteger(0, trainId);
				q.setString(1, className);
				List<ClassType> li = q.list();
				System.out.println("List " + li);
				ClassType classUser = (ClassType) li.get(0);
				double price = classUser.getPrice();

				tr.commit();
				session.flush();
				session.close();
				return price;
			}
		});
		return price;

	}
}
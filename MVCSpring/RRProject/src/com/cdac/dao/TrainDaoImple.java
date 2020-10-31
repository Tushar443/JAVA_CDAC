package com.cdac.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cdac.dto.Train;

@Repository
public class TrainDaoImple implements ITrainDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void addTrain(Train train) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(train);
				tr.commit();
				session.flush();
				session.clear();
				return null;
			}

		});

	}

}

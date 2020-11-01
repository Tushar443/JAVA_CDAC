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

	@Override
	public void deleteTrain(int trainId) {
		// hibernateTemplate.execute(new HibernateCallback<Void>() {

		// @Override
		// public Void doInHibernate(Session session) throws HibernateException {
//				Transaction tr = session.beginTransaction();
//				session.delete(new Expense(expenseId));
//				tr.commit();
//				session.flush();
//				session.close();
//				return null;
//	}

//	});

	}

	@Override
	public Train selectTrain(int trainId) {
//		Expense expense = hibernateTemplate.execute(new HibernateCallback<Expense>() {
//			
//						@Override
//						public Expense doInHibernate(Session session) throws HibernateException {
//							Transaction tr = session.beginTransaction();
//							Expense ex = (Expense) session.get(Expense.class, expenseId);
//							tr.commit();
//							session.flush();
//							session.close();
//							return ex;
//						}
//					});				
		return null;
	}

	@Override
	public void upateTrain(Train train) {
		// hibernateTemplate.execute(new HibernateCallback<Void>() {
		//
//						@Override
//						public Void doInHibernate(Session session) throws HibernateException {
//							Transaction tr = session.beginTransaction();
		//
////							Expense ex = (Expense) session.get(Expense.class, expense.getExpenseId());
////							ex.setItemName(expense.getItemName());
////							ex.setPrice(expense.getPrice());
////							ex.setPurchaseDate(expense.getPurchaseDate());
		//
//							session.update(expense);
//							tr.commit();
//							session.flush();
//							session.close();
//							return null;
//						}
		//
//					});
		//

	}

	@Override
	public List<Train> selectAll() {

		List<Train> trains = hibernateTemplate.execute(new HibernateCallback<List<Train>>() {

			@Override
			public List<Train> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Train");
				List<Train> tList = q.list();
				tr.commit();
				session.flush();
				session.close();
				return tList;
			}
		});

		return trains;
	}
}

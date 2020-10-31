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

import com.cdac.dto.Expense;

@Repository
public class ExpenseDaoImple implements IExpenseDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void insertExpense(Expense expense) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(expense);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}

		});
	}

	@Override
	public void deleteExpense(int expenseId) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.delete(new Expense(expenseId));
				tr.commit();
				session.flush();
				session.close();
				return null;
			}

		});
	}

	@Override
	public Expense selectExpense(int expenseId) {
		Expense expense = hibernateTemplate.execute(new HibernateCallback<Expense>() {

			@Override
			public Expense doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Expense ex = (Expense) session.get(Expense.class, expenseId);
				tr.commit();
				session.flush();
				session.close();
				return ex;
			}
		});
		return expense;
	}

	@Override
	public void upateExpense(Expense expense) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.update(expense);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}

		});
	}

	@Override
	public List<Expense> selectAll(int userID) {
		List<Expense> expense = hibernateTemplate.execute(new HibernateCallback<List<Expense>>() {

			@Override
			public List<Expense> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from expense where userId=?");
				q.setInteger(0, userID);
				List<Expense> li = q.list();
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
		});
		return expense;
	}

}

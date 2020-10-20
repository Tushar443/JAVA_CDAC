package com.service;

import java.util.ArrayList;

import com.dao.ExpenseDaoImple;
import com.dao.IExpenseDao;
import com.dto.Expense;

public class ExpenseService implements IExpenseServ {

	private IExpenseDao expenseDao;
	
	public ExpenseService() {
		expenseDao = new ExpenseDaoImple();
	}
	
	@Override
	public int addExpense(Expense ex) {
		return expenseDao.insertExpense(ex);
	}

	@Override
	public int modifyExpense(Expense ex) {
		// TODO Auto-generated method stub
		return expenseDao.updateExpense(ex);
	}

	@Override
	public int removeExpense(int expenseId) {
		// TODO Auto-generated method stub
		return expenseDao.deleteExpense(expenseId);
	}

	@Override
	public ArrayList<Expense> expenseList(int userId) {
		// TODO Auto-generated method stub
		return expenseDao.selectAll(userId);
	}

	@Override
	public Expense findExpense(int expenseId) {
		// TODO Auto-generated method stub
		return null;
	}

}

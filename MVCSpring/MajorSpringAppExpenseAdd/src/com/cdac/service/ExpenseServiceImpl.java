package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.IExpenseDao;
import com.cdac.dto.Expense;

@Service
public class ExpenseServiceImpl implements IExpenseService {

	@Autowired
	private IExpenseDao expenseDao;

	@Override
	public void addExpense(Expense expense) {
		expenseDao.insertExpense(expense);
	}

	@Override
	public void removeExpense(int expenseId) {
		expenseDao.deleteExpense(expenseId);
	}

	@Override
	public Expense findExpense(int expenseId) {

		return expenseDao.selectExpense(expenseId);
	}

	@Override
	public void modifyExpense(Expense expense) {
		expenseDao.upateExpense(expense);

	}

	@Override
	public List<Expense> selectAll(int userID) {

		return expenseDao.selectAll(userID);
	}

}

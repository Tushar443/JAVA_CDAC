package com.cdac.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cdac.dao.ExpenseDaoImpl;
import com.cdac.dao.IExpense;
import com.cdac.dto.Expense;
@Service
public class ExpenseService implements IExpenseService {

	private IExpense expenseDao;

	public void addExpense(Expense e) {
		expenseDao.insertExpense(e);
	}

	public void removeExpense(int expenseId) {
		
		expenseDao.deleteExpense(expenseId);
	}

	public Expense findExpese(int expenseId) {
		
		return expenseDao.selectExpese(expenseId);
	}

	public void modifyExpense(Expense e) {
		expenseDao.updateExpense(e);
		
	}

	public List<Expense> expenseList(int userId) {
		
		return expenseDao.selectAll(userId);
	}
	
	
}

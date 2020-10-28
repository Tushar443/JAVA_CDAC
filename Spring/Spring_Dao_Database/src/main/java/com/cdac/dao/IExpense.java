package com.cdac.dao;

import java.util.List;

import com.cdac.dto.Expense;

public interface IExpense {
	void insertExpense(Expense e);
	void deleteExpense(int expenseId);
	Expense selectExpese(int expenseId);
	void updateExpense(Expense e);
	List<Expense> selectAll(int userId);
}

package com.cdac.dao;

import java.util.List;

import com.cdac.dto.Expense;

public interface IExpenseDao {
	void insertExpense(Expense expense);

	void deleteExpense(int expenseId);

	Expense selectExpense(int expenseId);

	void upateExpense(Expense expense);

	List<Expense> selectAll(int userID);

}

package com.cdac.service;

import java.util.List;

import com.cdac.dto.Expense;

public interface IExpenseService {
	void addExpense(Expense expense);

	void removeExpense(int expenseId);

	Expense findExpense(int expenseId);

	void modifyExpense(Expense expense);

	List<Expense> selectAll(int userID);

}

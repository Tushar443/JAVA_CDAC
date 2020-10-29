package com.cdac.service;

import java.util.List;

import com.cdac.dto.Expense;

public interface IExpenseService {
	void addExpense(Expense e);
	void removeExpense(int expenseId);
	Expense findExpese(int expenseId);
	void modifyExpense(Expense e);
	List<Expense> expenseList(int userId);
}

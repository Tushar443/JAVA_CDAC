package com.service;

import java.util.ArrayList;

import com.dto.Expense;

public interface IExpenseServ {
	int addExpense(Expense ex);
	int modifyExpense(Expense ex);
	int removeExpense(int expenseId);
	ArrayList<Expense> expenseList(int userId);
	Expense findExpense(int expenseId);
}

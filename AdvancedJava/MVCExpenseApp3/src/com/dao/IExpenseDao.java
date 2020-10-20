package com.dao;

import java.util.ArrayList;

import com.dto.Expense;

public interface IExpenseDao {
	int insertExpense(Expense ex);
	int updateExpense(Expense ex);
	int deleteExpense(int expenseId);
	ArrayList<Expense> selectAll(int userId);
	Expense getExpense(int expenseId);
}

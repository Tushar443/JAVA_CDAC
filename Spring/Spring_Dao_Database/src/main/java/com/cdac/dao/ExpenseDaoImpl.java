package com.cdac.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.cdac.dto.Expense;

@Repository
public class ExpenseDaoImpl implements IExpense {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void insertExpense(Expense e) {
		String q = "insert into expense (item_name,price,pur_date,user_id) values(?,?,?,?)";
		jdbcTemplate.update(q);
		System.out.println("done");

	}

	public void deleteExpense(int expenseId) {
		
	}

	public Expense selectExpese(int expenseId) {
		
		return null;
	}

	public void updateExpense(Expense e) {
		

	}

	public List<Expense> selectAll(int userId) {
		jdbcTemplate.query("select * from expense where user_id = "+userId, new ResultSetExtractor<Expense>)
		return null;
	}

}

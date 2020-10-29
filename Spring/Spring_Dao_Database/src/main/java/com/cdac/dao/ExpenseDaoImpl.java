package com.cdac.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
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
		jdbcTemplate.update(q, new Object[] {e.getItemName(),e.getPrice(),e.getPurchaseDate(),e.getUserId()});
		System.out.println("done");
	}

	public void deleteExpense(int expenseId) {
		String q = "delete from expense where expense_id = ?";
		jdbcTemplate.update(q, new Object[] {expenseId});
		System.out.println("done");
	}

	public Expense selectExpese(int expenseId) {
		
		return null;
	}

	public void updateExpense(Expense e) {
		String q = "update expense set item_name=?,price=?,pur_date=?,user_id=?";
		jdbcTemplate.update(q, new Object[] {e.getItemName(),e.getPrice(),e.getPurchaseDate(),e.getUserId()});
		System.out.println("done");

	}

	public List<Expense> selectAll(int userId) {
//		List<Expense> list = jdbcTemplate.query("select * from expense where user_id ="+userId,new ResultSetExtractor<List<Expense>>);
		
		return null;
	}

}

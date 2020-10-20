package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.conn.MyConn;
import com.dto.Expense;

public class ExpenseDaoImple implements IExpenseDao {
	private MyConn mycon;
	
	

	public ExpenseDaoImple() {
		this.mycon =  new MyConn();
	}

	@Override
	public int insertExpense(Expense ex) {
		int i =0;
		
		System.out.println(ex);
		try {
			Connection con = mycon.getCon();
			PreparedStatement ps = con.prepareStatement("insert into expense(item_name,price,pur_date,user_id values(?,?,?,?)");
			ps.setString(1, ex.getItemName());
			ps.setFloat(2,ex.getPrice());
			ps.setString(3, ex.getPurDate());
			ps.setInt(4, ex.getUserId());
			 i = ps.executeUpdate();
			ps.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int updateExpense(Expense ex) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteExpense(int expenseId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Expense> selectAll(int userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Expense getExpense(int expenseId) {
		// TODO Auto-generated method stub
		return null;
	}

}

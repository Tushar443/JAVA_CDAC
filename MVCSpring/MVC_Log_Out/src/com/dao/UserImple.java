package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.conn.MyConn;
import com.dto.User;

public class UserImple implements IUserDao{
	private MyConn myCon;

	public UserImple() {
		myCon =new MyConn(); 
	}

	@Override
	public int insertUser(User user) {
		int i =0;
		try {
			Connection con = myCon.getCon();
			PreparedStatement ps = con.prepareStatement("insert into Loginuser(user_name,user_pass)values(?,?)");
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getUserPass());
			i=ps.executeUpdate();
			ps.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public boolean login(User user) {
		boolean flag =false;
		try {
			Connection con = myCon.getCon();
			PreparedStatement ps = con.prepareStatement("select * from Loginuser where user_name=? and user_pass=?");
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getUserPass());
			ResultSet rs =ps.executeQuery();
			while(rs.next()) {
				flag = true;
			}
			ps.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

}

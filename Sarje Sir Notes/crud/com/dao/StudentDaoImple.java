package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.conn.MyConn;
import com.dto.Student;

public class StudentDaoImple implements StudentDao {
	
	private MyConn myConn;
	
	public StudentDaoImple() {
		myConn = new MyConn();
	}

	@Override
	public int insertData(Student student) {
		int i = 0;
		try {
			Connection con = myConn.getConn();
			PreparedStatement s = con.prepareStatement(
					"insert into student values(?,?,?,?)");
			s.setInt(1, student.getRno());
			s.setString(2, student.getName());
			s.setString(3, student.getCourse());
			s.setFloat(4, student.getFee());
			i = s.executeUpdate();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
		}
		return i;
	}

	@Override
	public int updateData(Student student) {
		int i = 0;
		try {
			Connection con = myConn.getConn();
			PreparedStatement s = con.prepareStatement(
					"update student set name = ?, course = ?, fee = ? where rno = ?");	
			s.setString(1, student.getName());
			s.setString(2, student.getCourse());
			s.setFloat(3, student.getFee());
			s.setInt(4, student.getRno());
			i = s.executeUpdate();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
		}
		return i;
	}

	@Override
	public int deleteData(int rno) {
		int i = 0;
		try {
			Connection con = myConn.getConn();
			PreparedStatement s = con.prepareStatement(
					"delete from student where rno = ?");	
			s.setInt(1, rno); 
			i = s.executeUpdate();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
		}
		return i;
	}

	@Override
	public ArrayList<Student> selectData() {
		ArrayList<Student> al = new ArrayList<>();
		try {
			Connection con = myConn.getConn();
			PreparedStatement s = con.prepareStatement(
					"select * from student");	
			ResultSet rs = s.executeQuery();
			while(rs.next()) {
				Student std = new Student();
				std.setRno(rs.getInt(1));
				std.setName(rs.getString(2));
				std.setCourse(rs.getString(3));
				std.setFee(rs.getFloat(4));
				al.add(std);
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
		}
		return al;
	}

}

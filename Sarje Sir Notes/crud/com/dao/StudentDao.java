package com.dao;

import java.util.ArrayList;

import com.dto.Student;

public interface StudentDao {
	int insertData(Student student);
	int updateData(Student student);
	int deleteData(int rno);
	ArrayList<Student> selectData();
}

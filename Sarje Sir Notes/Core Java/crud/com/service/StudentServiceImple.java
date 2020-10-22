package com.service;

import java.util.ArrayList;

import com.dao.StudentDao;
import com.dao.StudentDaoImple;
import com.dto.Student;

public class StudentServiceImple implements StudentService {
	
	private StudentDao studentDao;
	
	

	public StudentServiceImple() {
		studentDao = new StudentDaoImple();
	}

	@Override
	public int addStudent(Student student) {
		return studentDao.insertData(student);
	}

	@Override
	public int modifyStudent(Student student) {
		return studentDao.updateData(student);
	}

	@Override
	public int removeStudent(int rno) {
		return studentDao.deleteData(rno);
	}

	@Override
	public ArrayList<Student> studentList() {
		return studentDao.selectData();
	}
	

}

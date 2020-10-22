package com.service;

import java.util.ArrayList;

import com.dto.Student;

public interface StudentService {
	public int addStudent(Student student);
	public int modifyStudent(Student student);
	public int removeStudent(int rno);
	public ArrayList<Student> studentList();
}

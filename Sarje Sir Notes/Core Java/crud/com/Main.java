package com;

import java.util.ArrayList;
import java.util.Scanner;

import com.dto.Student;
import com.service.StudentService;
import com.service.StudentServiceImple;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("0 to exit");
			System.out.println("1 to show student list");
			System.out.println("2 to add student record");
			System.out.println("3 to mofify student record");
			System.out.println("4 to remove student record");
			int choice = sc.nextInt();
			switch(choice) {
				case 0:
					System.exit(0);
				case 1 :
					StudentService studentService = new StudentServiceImple();
					ArrayList<Student> l = studentService.studentList();
					for(Student s : l) {
						System.out.println(s);
					}
					break;
				case 2 :
					System.out.println("Enter rno");
					int rno = sc.nextInt();
					System.out.println("Enter name");
					String name = sc.next();
					System.out.println("Enter course");
					String course  = sc.next();
					System.out.println("Enter fee");
					float fee = sc.nextFloat();
					Student student = new Student(rno, name, course, fee);
					studentService = new StudentServiceImple();
					int i = studentService.addStudent(student);
					System.out.println(i+" record added");
					break;
				case 3 :
					System.out.println("Enter rno");
					rno = sc.nextInt();
					System.out.println("Enter name");
					name = sc.next();
					System.out.println("Enter course");
					course  = sc.next();
					System.out.println("Enter fee");
					fee = sc.nextFloat();
					student = new Student(rno, name, course, fee);
					studentService = new StudentServiceImple();
					i = studentService.modifyStudent(student);
					System.out.println(i+" record modified");
					break;	
				case 4 :
					System.out.println("Enter rno");
					rno = sc.nextInt();
					studentService = new StudentServiceImple();
					i = studentService.removeStudent(rno);
					System.out.println(i+" record deleted");
					break;		
			}
		}
	}

}

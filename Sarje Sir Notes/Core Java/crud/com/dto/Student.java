package com.dto;

public class Student {
	private int rno;
	private String name;
	private String course;
	private float fee;
	public Student() {

	}
	public Student(int rno, String name, String course, float fee) {
		super();
		this.rno = rno;
		this.name = name;
		this.course = course;
		this.fee = fee;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public float getFee() {
		return fee;
	}
	public void setFee(float fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return rno + " " + name + " " + course + " " + fee;
	}
	
	
}

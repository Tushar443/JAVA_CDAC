package com.dto;

import java.util.Date;

public class Employee {
	
	private int empid;
	private String empName;
	private float basicSalary;
	private String dept;
	private Date joinDate;

	@Override
	public String toString() {
		return  empid + " " + empName + " " + basicSalary + " " + dept
				+ " " + joinDate ;
	}

	public Employee(int empid, String empName, float basicSalary, String dept, Date joinDate) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.basicSalary = basicSalary;
		this.dept = dept;
		this.joinDate = joinDate;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public Employee() {	}

}

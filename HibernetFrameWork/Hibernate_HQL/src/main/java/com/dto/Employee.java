package com.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="EMP")
public class Employee {
	@Id
	@Column(name="emp_id")
	private int empid;
	@Column(name="emp_name")
	private String empName;
	@Column(name="basic_salary")
	private float basicSalary;
	@Column(name="dept")
	private String dept;
	@Temporal(TemporalType.DATE)
	private Date joinDate;

	@Override
	public String toString() {
		return  empid + " " + empName + " " + basicSalary + " " + dept
				+ " " + joinDate ;
	}

	
	
	public Employee(int empid) {
		this.empid = empid;
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

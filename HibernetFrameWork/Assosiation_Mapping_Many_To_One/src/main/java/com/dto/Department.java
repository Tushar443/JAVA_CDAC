package com.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dept1")
public class Department {

	@Id
	@Column(name = "dept_id")
	private int deptId;
	@Column(name = "dept_name")
	private String deptaName;

	public Department() {

	}

	public Department(int deptId, String deptaName) {
		super();
		this.deptId = deptId;
		this.deptaName = deptaName;
	}

	@Override
	public String toString() {
		return deptId + " " + deptaName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptaName() {
		return deptaName;
	}

	public void setDeptaName(String deptaName) {
		this.deptaName = deptaName;
	}

}

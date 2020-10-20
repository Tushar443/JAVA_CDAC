package DTO;

public class Student {
	private int rno;
	private String sname;
	private float fee;
	private String course;
	
	public Student() {
	}

	public Student(int rno, String sname, float fee, String course) {
		super();
		this.rno = rno;
		this.sname = sname;
		this.fee = fee;
		this.course = course;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public float getFee() {
		return fee;
	}

	public void setFee(float fee) {
		this.fee = fee;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	

}

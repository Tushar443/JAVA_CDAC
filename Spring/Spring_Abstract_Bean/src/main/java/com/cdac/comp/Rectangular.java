package com.cdac.comp;

public class Rectangular extends Shape {
	private float length;
	private float breath;
	
	
	public Rectangular(float area, float length, float breath) {
		super(area);
		this.length = length;
		this.breath = breath;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getBreath() {
		return breath;
	}
	public void setBreath(float breath) {
		this.breath = breath;
	}
	public Rectangular() {
		
	}
	public Rectangular(float area) {
		super(area);
		// TODO Auto-generated constructor stub
	}
	
	
}

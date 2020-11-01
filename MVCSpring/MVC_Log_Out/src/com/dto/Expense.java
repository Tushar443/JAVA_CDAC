package com.dto;

public class Expense {
	private int expense_id;
	private String itemName;
	private float price;
	private String purchaseDate;
	private int userId;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Expense() {
	}
	public int getExpense_id() {
		return expense_id;
	}
	public void setExpense_id(int expense_id) {
		this.expense_id = expense_id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPurDate() {
		return purchaseDate;
	}
	public void setPurDate(String purDate) {
		this.purchaseDate = purDate;
	}
	@Override
	public String toString() {
		return  expense_id + " " + itemName + " " + price + " "
				+ purchaseDate+ " "+ userId;
	}
	
}

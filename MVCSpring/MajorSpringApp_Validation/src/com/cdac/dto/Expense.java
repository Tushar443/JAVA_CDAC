package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "expense")
public class Expense {
	@Id
	@GeneratedValue
	@Column(name = "expense_id")
	private int expenseId;
	@Column(name = "item_name")
	private String itemName;
	@Column(name = "price")
	private float price;
	@Column(name = "pur_date")
	private String purchaseDate;
	@Column(name = "user_id")
	private int userId;

	public Expense(int expenseId) {
		super();
		this.expenseId = expenseId;
	}

	public Expense() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Expense [expenseId=" + expenseId + ", itemName=" + itemName + ", price=" + price + ", purchaseDate="
				+ purchaseDate + ", userId=" + userId + "]";
	}

	public int getExpenseId() {
		return expenseId;
	}

	public void setExpenseId(int expenseId) {
		this.expenseId = expenseId;
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

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}

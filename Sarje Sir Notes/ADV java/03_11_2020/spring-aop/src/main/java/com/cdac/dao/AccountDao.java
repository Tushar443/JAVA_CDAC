package com.cdac.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDao {
	
	public void createAccount() {
		System.out.println("creating account");	
	}
	
	public void withdraw() {
		System.out.println("withdrawing amount");
	}
	
	public void deposite() {
		System.out.println("amount deposite");
	}
	
	public void blockAccount() {
		System.out.println("blocking account");
//		int i = 20/0;
		System.out.println("account blocked");
	}
}

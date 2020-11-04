
package com.cdac.comp;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDao {
	public void createAcc() {
		System.out.println("create Account");
	}
	
	public void withDraw() {
		System.out.println("Withdraw Account");
	}
	
	public void deposite() {
		System.out.println("Deposite Account");
	}
	
	public void blockAcc() {
		System.out.println("Blocking Account");
		int i = 20/0;
		System.out.println("Account Block");
	}

	public void MyAccount() {
		System.out.println("My Account");
	}
}

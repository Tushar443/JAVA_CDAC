package com.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.dto.Expense;
import com.cdac.service.ExpenseService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("cfg.xml");
		ExpenseService es  = a.getBean(ExpenseService.class);
		Expense e = new Expense("fan1",8090.4f,"2020-09-10",2);
		es.addExpense(e);
	}

}

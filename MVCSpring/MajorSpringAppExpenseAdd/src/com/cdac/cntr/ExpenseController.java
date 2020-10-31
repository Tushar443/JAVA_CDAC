package com.cdac.cntr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cdac.dto.Expense;
import com.cdac.service.IExpenseService;

@Controller
public class ExpenseController {
	@Autowired
	private IExpenseService expenseService;

	@RequestMapping(value = "/prep_expense_form.htm")
	public String preExpenseAddForm(ModelMap map) {
		map.put("expense", new Expense());
		return "expense_form";
	}

	@RequestMapping(value = "/expense_add.htm", method = RequestMethod.POST)
	public String expenseAdd(Expense expense, ModelMap map) {
		expenseService.addExpense(expense);
		return "home";
	}
}

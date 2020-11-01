package com.cdac.cntr;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.dto.Expense;
import com.cdac.dto.User;
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
	public String expenseAdd(Expense expense, ModelMap map, HttpSession session) {
		int userId = ((User) session.getAttribute("user")).getUserId();
		expense.setUserId(userId);
		expenseService.addExpense(expense);
		return "home";
	}

	@RequestMapping(value = "/expense_list.htm", method = RequestMethod.GET)
	public String allExpense(ModelMap map, HttpSession session) {
		int userId = ((User) session.getAttribute("user")).getUserId();
		List<Expense> li = expenseService.selectAll(userId);
		map.put("expList", li);
		return "expense_list";
	}

	@RequestMapping(value = "/expense_delete.htm", method = RequestMethod.GET)
	public String deleteExpense(@RequestParam int expenseId, ModelMap map, HttpSession session) {
		expenseService.removeExpense(expenseId);
		int userId = ((User) session.getAttribute("user")).getUserId();
		List<Expense> li = expenseService.selectAll(userId);
		map.put("expList", li);
		return "expense_list";
	}

	@RequestMapping(value = "/expense_update.htm", method = RequestMethod.GET)
	public String updateExpenesForm(@RequestParam int expenseId, ModelMap map) {
		Expense exp = expenseService.findExpense(expenseId);
		map.put("expense", exp);
		return "expense_update_form";
	}

	@RequestMapping(value = "/expense_update_form.htm", method = RequestMethod.POST)
	public String updateExpense(Expense expense, ModelMap map, HttpSession session) {

		int userId = ((User) session.getAttribute("user")).getUserId();
		expense.setExpenseId(userId);
		expenseService.modifyExpense(expense);
		List<Expense> li = expenseService.selectAll(userId);
		map.put("expList", li);
		return "expense_list";
	}
}

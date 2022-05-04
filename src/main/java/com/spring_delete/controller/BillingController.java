package com.spring_delete.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring_delete.entities.Billing;
import com.spring_delete.service.BillingService;

@Controller
public class BillingController {
	@Autowired
	private BillingService billingServ;
	
	@RequestMapping("saveBill")
	public String saveBill(Billing bill,ModelMap model) {
		billingServ.saveOneBill(bill);
		model.addAttribute("bill", bill);
		return "billing_info";
	}
}

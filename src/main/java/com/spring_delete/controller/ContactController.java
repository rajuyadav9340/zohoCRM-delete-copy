package com.spring_delete.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring_delete.entities.Contact;
import com.spring_delete.service.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService contactServ;
	
	@RequestMapping("listallContact")
	public String listallContact(ModelMap model) {
		List<Contact> contacts = contactServ.listAllContact();
		model.addAttribute("contacts", contacts);
		return "listall_contact";
	}
	@RequestMapping("createBilling")
	public String createBilling(@RequestParam("id")int id,ModelMap model) {
		Contact contacts = contactServ.getOneBillById(id);
		model.addAttribute("contacts", contacts);
		return "create_bill";
	}
}

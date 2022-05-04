package com.spring_delete.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring_delete.entities.Contact;
import com.spring_delete.entities.Lead;
import com.spring_delete.service.ContactService;
import com.spring_delete.service.LeadService;

@Controller
public class LeadController {
	@Autowired
	private LeadService leadServ;
	
	@Autowired
	private ContactService contactServ;
	
	@RequestMapping("new")
	public String newData() {
		return "create_lead";
	}
	
	@RequestMapping("saveLead")
	public String saveLead(Lead lead,ModelMap model) {
		leadServ.saveOneLead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	@RequestMapping("composeEmail")
	public String composeEmail(@RequestParam("emailId") String email,ModelMap model) {
		model.addAttribute("email", email);
		return "compose_email";
	}
	@RequestMapping("listall")
	public String listAll(ModelMap model) {
		List<Lead> lead = leadServ.listAllLead();
		model.addAttribute("lead", lead);
		return "listall";
	}
	@RequestMapping("leadById")
	public String leadById(@RequestParam("id")int id,ModelMap model) {
		Lead lead = leadServ.showLeadById(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	
	@RequestMapping("convert")
	public String convert(@RequestParam("id")int id,ModelMap model) {
		Lead lead = leadServ.showLeadById(id);
		
		Contact contact = new Contact();
		
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setMobile(lead.getMobile());
		contact.setEmail(lead.getEmail());
		contact.setLeadSource(lead.getLeadSource());
		
		contactServ.saveOneContact(contact);
		
		leadServ.deleteById(id);
		
		List<Contact> contacts = contactServ.listAllContact();
		model.addAttribute("contacts", contacts);
		return "listall_contact";
	}
}

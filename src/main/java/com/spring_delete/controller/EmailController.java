package com.spring_delete.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring_delete.utilities.EmailService;

@Controller
public class EmailController {
	@Autowired
	private EmailService emailServ;
	
	@RequestMapping("sendEmail")
	public String sendEmail(@RequestParam("to")String to,@RequestParam("subject")String subject,@RequestParam("body")String body) {
		emailServ.sendSimpleMessage(to,subject,body);
		return "compose_email";
	}
}

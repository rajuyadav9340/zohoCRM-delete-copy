package com.spring_delete.service;

import java.util.List;

import com.spring_delete.entities.Contact;

public interface ContactService {

	void saveOneContact(Contact contact);

	public List<Contact> listAllContact();

	Contact getOneBillById(int id);

}

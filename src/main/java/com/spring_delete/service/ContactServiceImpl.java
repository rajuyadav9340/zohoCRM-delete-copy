package com.spring_delete.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_delete.entities.Contact;
import com.spring_delete.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepository contactRepo;

	@Override
	public void saveOneContact(Contact contact) {
		contactRepo.save(contact);
	}

	@Override
	public List<Contact> listAllContact() {
		List<Contact> contacts = contactRepo.findAll();
		return contacts;
	}

	@Override
	public Contact getOneBillById(int id) {
		Optional<Contact> findById = contactRepo.findById(id);
		Contact contacts = findById.get();
		return contacts;
	}
}

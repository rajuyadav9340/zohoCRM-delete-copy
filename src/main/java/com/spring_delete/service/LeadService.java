package com.spring_delete.service;

import java.util.List;

import com.spring_delete.entities.Lead;

public interface LeadService {

	void saveOneLead(Lead lead);

	public List<Lead> listAllLead();

	Lead showLeadById(int id);

	void deleteById(int id);

}

package com.spring_delete.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_delete.entities.Lead;
import com.spring_delete.repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {
	@Autowired
	private LeadRepository leadRepo;
	
	@Override
	public void saveOneLead(Lead lead) {
		leadRepo.save(lead);
	}

	@Override
	public List<Lead> listAllLead() {
		List<Lead> lead = leadRepo.findAll();
		return lead;
	}

	@Override
	public Lead showLeadById(int id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

	@Override
	public void deleteById(int id) {
		leadRepo.deleteById(id);
	}

}

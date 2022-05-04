package com.spring_delete.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_delete.entities.Billing;
import com.spring_delete.repository.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {
	@Autowired
	private BillingRepository billingRepo;

	@Override
	public void saveOneBill(Billing bill) {
		billingRepo.save(bill);
	}
}

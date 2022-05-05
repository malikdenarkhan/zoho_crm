package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Lead;
import com.zohocrm.repositories.LeadRepository;
@Service
public class LeadServiceimpl implements LeadService {

	@Autowired
	private LeadRepository leadrepo;
	@Override
	public void saveLead(Lead lead) {
		try {
			leadrepo.save(lead);
		} catch (Exception e) {
		e.printStackTrace();
		}

	}
	@Override
	public List<Lead> findAllLeads() {
		
		List<Lead> leads = leadrepo.findAll();
		return leads;
	}
	@Override
	public Lead getLead(long id) {
		Optional<Lead> findById = leadrepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}
	@Override
	public void deleteLead(long id) {
		leadrepo.deleteById(id);
		
	}

}

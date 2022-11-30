package com.solera.crm.SoleraCRM.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.solera.crm.SoleraCRM.models.Contact;

@Component
public class ContactDao {
	

	private static int ID = 0;
	
	@Autowired
	OportunityDao oportunityDao;
	
	public List<Contact> findByOportunitytId(Integer id){
		return oportunityDao.findById(id).getContacts();
	}
	
	public void createContactByOportunityId(Integer id, Contact contact) {
		oportunityDao.findById(id).getContacts().add(contact);
	}
		
	
}

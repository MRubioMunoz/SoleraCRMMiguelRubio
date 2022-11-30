package com.solera.crm.SoleraCRM.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.solera.crm.SoleraCRM.models.Contact;

@Component
public class ContactDao {
	

	private static int ID = 0;
	public static List<Contact> contacts = new ArrayList<>();
	
	@Autowired
	OportunityDao oportunityDao;
	
	public ArrayList<Contact> findByOportunitytId(Integer id){
		return oportunityDao.findById(id).getContacts();
	}
	
	public void createContactByOportunityId(Integer id, Contact contact) {
		contact.setidContact(++ID);
		if(!oportunityDao.findById(id).getIs_client() && contact.getResult()) 
			oportunityDao.findById(id).setIs_client(true);
		
		oportunityDao.findById(id).getContacts().add(contact);
		
	}
	
}

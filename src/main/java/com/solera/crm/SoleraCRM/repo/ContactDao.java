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
	
	//Get the Contact list inside an opportunity
	
	public ArrayList<Contact> findByOportunitytId(Integer id){
		return oportunityDao.findById(id).getContacts();
	}
	
	//Create a contact inside an oportunity
	
	public void createContactByOportunityId(Integer id, Contact contact) {	
		contact.setidContact(++ID);
		if(!oportunityDao.findById(id).getClient() && contact.getResult()) 
			oportunityDao.findById(id).setClient(true);
		
		oportunityDao.findById(id).getContacts().add(contact);
		
	}
	
}

package com.solera.crm.SoleraCRM.repo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.solera.crm.SoleraCRM.models.Contact;

@Component
public class ContactDao {
	
	public static List<Contact> contacts = new ArrayList<>();
	private static int ID = 0;
	
	static {
		
		contacts.add(new Contact(ID, "Email", LocalDate.now(), true));
		contacts.add(new Contact(ID, "Whatsapp", LocalDate.now(), true));
		contacts.add(new Contact(ID, "Telephone", LocalDate.now(), true));
		contacts.add(new Contact(ID, "Email", LocalDate.now(), false));
		
	}
	
	

}

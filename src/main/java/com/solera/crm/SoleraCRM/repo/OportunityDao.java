package com.solera.crm.SoleraCRM.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.solera.crm.SoleraCRM.models.Contact;
import com.solera.crm.SoleraCRM.models.Oportunity;

@Component
public class OportunityDao {
	
	public static List<Oportunity> oportunities = new ArrayList<>();
	public static ArrayList<Contact> contacts = new ArrayList<>();
	private static int ID =0;
	
	@Autowired
	ContactDao contactService;
	
	static {
		
		oportunities.add(new Oportunity(++ID,"Miguel" , "666333555", "miguel@solera.com", true, contacts));
		oportunities.add(new Oportunity(++ID,"Isabel" , "666777999", "isabel@solera.com", false, contacts));
	}
	
	public List<Oportunity> findAll(){
		return oportunities;
	}
	
	public Oportunity findById(Integer id) {
		return oportunities.stream().filter(oportunity -> oportunity.getIdOportunity().equals(id)).findFirst().get();
	}
	
	public void createOportunity(Oportunity oportunity) {
		oportunity.setIdOportunity(++ID);
		oportunities.add(oportunity);
	}
	
	public void deleteOportunity(Integer id) { 
		oportunities.remove(findById(id));
	}
	
	public void updateOportunity(Integer id,Oportunity oportunity) {
		Oportunity o = findById(id);
		
		o.setName(oportunity.getName());
		o.setTelephone(oportunity.getTelephone());
		o.setEmail(oportunity.getEmail());
		o.setIs_client(oportunity.getIs_client());
		o.setContacts(oportunity.getContacts());
	}
}

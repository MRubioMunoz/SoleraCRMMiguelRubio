package com.solera.crm.SoleraCRM.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.solera.crm.SoleraCRM.models.Oportunity;

@Component
public class OportunityDao {
	
	public static List<Oportunity> oportunities = new ArrayList<>();
	private static int ID =0;
	
	static {
		
		oportunities.add(new Oportunity(++ID,"Miguel" , "666333555", "miguel@solera.com", true, ContactDao.contacts));
		oportunities.add(new Oportunity(++ID,"Isabel" , "666777999", "isabel@solera.com", false, ContactDao.contacts));
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

package com.solera.crm.SoleraCRM.repo;

import java.util.ArrayList;
import java.util.List;

import com.solera.crm.SoleraCRM.models.Oportunity;


public class OportunityDao {
	
	public static List<Oportunity> oportunities = new ArrayList<>();
	private static Long ID =(long) 0;
	
	static {
		
		oportunities.add(new Oportunity(ID++,"Miguel" , "666333555", "miguel@solera.com", true, ContactDao.contacts));
		oportunities.add(new Oportunity(ID++,"Isabel" , "666777999", "isabel@solera.com", false, ContactDao.contacts));
	}
	
	public List<Oportunity> findAll(){
		return oportunities;
	}
	
	
	
}

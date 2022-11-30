package com.solera.crm.SoleraCRM;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.solera.crm.SoleraCRM.models.Contact;
import com.solera.crm.SoleraCRM.models.Oportunity;
import com.solera.crm.SoleraCRM.repo.ContactDao;
import com.solera.crm.SoleraCRM.repo.OportunityDao;

@SpringBootTest
class SoleraCrmApplicationTests {
	
	@Autowired
	OportunityDao oportunityDao;
	
	@Autowired
	ContactDao contactDao;
	
	@Test
	void oportunityWithContactResultTrueIsAClient() {
		//Integer idContact, String type, LocalDate date, Boolean result, Integer idOportunity
		contactDao.createContactByOportunityId(2, new Contact(3,"test",LocalDate.now(), true, 2));
		System.out.println(oportunityDao.findById(2).getIs_client());
		assertEquals(oportunityDao.findById(2).getIs_client(), oportunityDao.findById(2).getContacts().get(0).getResult());
	}
	
}

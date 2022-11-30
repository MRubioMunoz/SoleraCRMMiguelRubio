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
	void updateOportunityTest() {
		Oportunity oUpdate = new Oportunity(1, "UpdateTest","666333555", "test@solera.com", false, OportunityDao.contacts);
		oportunityDao.updateOportunity(1,oUpdate);
		assertEquals(oportunityDao.findById(1).getName(), "UpdateTest");
		assertEquals(oportunityDao.findById(1).getEmail(), "test@solera.com");
	}
	
	@Test
	void oportunityWithContactResultTrueIsAClient() {
		//Integer idContact, String type, LocalDate date, Boolean result, Integer idOportunity
		contactDao.createContactByOportunityId(2, new Contact(3,"test",LocalDate.now(), true, 2));
		assertEquals(oportunityDao.findById(2).getIs_client(), oportunityDao.findById(2).getContacts().get(0).getResult());
	}
	
}

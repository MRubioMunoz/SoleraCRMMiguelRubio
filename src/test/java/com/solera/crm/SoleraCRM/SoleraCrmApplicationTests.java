package com.solera.crm.SoleraCRM;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.solera.crm.SoleraCRM.models.Contact;
import com.solera.crm.SoleraCRM.repo.ContactDao;
import com.solera.crm.SoleraCRM.repo.OportunityDao;

@SpringBootTest
class SoleraCrmApplicationTests {
	
	@Autowired
	OportunityDao oportunityDao;
	
	@Autowired
	ContactDao contactDao;
	
	//This @Test test if a opportunity that is not a client, when a contact has a good result, the opportunity must change his attribute client to true
	
	@Test
	void oportunityWithContactResultTrueIsAClient() {
		//Integer idContact, String type, LocalDate date, Boolean result, Integer idOportunity
		contactDao.createContactByOportunityId(2, new Contact(3,"test",LocalDate.now(), true));
		System.out.println(oportunityDao.findById(2).getClient());
		assertEquals(oportunityDao.findById(2).getClient()   , oportunityDao.findById(2).getContacts().get(0).getResult());
	}

}

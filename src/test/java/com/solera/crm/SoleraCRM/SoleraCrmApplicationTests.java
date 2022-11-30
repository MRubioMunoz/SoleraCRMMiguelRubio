package com.solera.crm.SoleraCRM;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.solera.crm.SoleraCRM.models.Oportunity;
import com.solera.crm.SoleraCRM.repo.ContactDao;
import com.solera.crm.SoleraCRM.repo.OportunityDao;

@SpringBootTest
class SoleraCrmApplicationTests {
	
	@Autowired
	OportunityDao oportunityDao;

	@Test
	void updateOportunityTest() {
		Oportunity oUpdate = new Oportunity((long) 1, "UpdateTest","666333555", "test@solera.com", false, ContactDao.contacts);
		oportunityDao.updateOportunity(oUpdate);
		assertEquals(oportunityDao.findOne((long) 1).getName(), "UpdateTest");
		assertEquals(oportunityDao.findOne((long) 1).getEmail(), "test@solera.com");
	}

}

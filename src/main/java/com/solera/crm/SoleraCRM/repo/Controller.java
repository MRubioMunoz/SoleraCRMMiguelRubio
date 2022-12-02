package com.solera.crm.SoleraCRM.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.solera.crm.SoleraCRM.models.Contact;
import com.solera.crm.SoleraCRM.models.Oportunity;

@RestController
@CrossOrigin(origins = "*")
public class Controller {
	
	// OPORTUNITY CONTROLLER
	
	private OportunityDao oportunityService;
	
	@Autowired
	private ContactDao contactService;
		
	public Controller(OportunityDao service) {
		this.oportunityService = service;
	}

	@GetMapping("/oportunity")
	public List<Oportunity> getAllOportunity(){
		return oportunityService.findAll();
	}
	
	@GetMapping("/oportunity/{id}")
	public Oportunity getOneOportunity(@PathVariable Integer id) {
		return oportunityService.findById(id);
	}
	
	@PostMapping("/oportunity")
	public void createNewOportunity(@RequestBody Oportunity oportunity) {
		oportunityService.createOportunity(oportunity);
	}
	
	@PostMapping("/oportunity/{id}")
	public void deleteOneOportunity(@PathVariable Integer id) {
		 oportunityService.deleteOportunity(id);
	}

	@PutMapping("/oportunity/{id}")
	public void updateOneOportunity(@PathVariable Integer id, @RequestBody Oportunity o) {
		oportunityService.updateOportunity(id, o);
	}
	
	// CONTACT CONTROLLER
	
	@GetMapping("/oportunity/{id}/contact")
	public List<Contact> getAllContactFromOportunity(@PathVariable Integer id){
		return contactService.findByOportunitytId(id);
	}
	
	@PostMapping("/oportunity/{id}/contact")
	public void createNewContact(@PathVariable Integer id, @RequestBody Contact contact) {
		contactService.createContactByOportunityId(id, contact);
	}
	
}

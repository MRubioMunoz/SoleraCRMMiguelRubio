package com.solera.crm.SoleraCRM.repo;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.solera.crm.SoleraCRM.models.Oportunity;

@RestController
@CrossOrigin(origins = "*")
public class OportunityController {
		
	private OportunityDao service;
		
	public OportunityController(OportunityDao service) {
		this.service = service;
	}

	@GetMapping("/oportunity")
	public List<Oportunity> getAllOportunity(){
		return service.findAll();
	}
	
	@GetMapping("/oportunity/{id}")
	public Oportunity getOneOportunity(@PathVariable Integer id) {
		return service.findById(id);
	}
	
	@PostMapping("/oportunity")
	public void createNewOportunity(@RequestBody Oportunity oportunity) {
		service.createOportunity(oportunity);
	}
	
	@DeleteMapping("/oportunity/{id}")
	public void deleteOneOportunity(@PathVariable Integer id) {
		 service.deleteOportunity(id);
	}

	@PutMapping("/oportunity/{id}")
	public void updateOneOportunity(@PathVariable Integer id, @RequestBody Oportunity o) {
		service.updateOportunity(id, o);
	}
	
}

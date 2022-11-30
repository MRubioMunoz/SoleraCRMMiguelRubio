package com.solera.crm.SoleraCRM.models;

import java.util.List;

public class Oportunity {

	private Long idOportunity;
	private String name;
	private String telephone;
	private String email;
	private Boolean is_client;
	private List<Contact> contacts;
	
	
	
	public Oportunity(Long idOportunity, String name, String telephone, String email, Boolean is_client,
			List<Contact> contacts) {
		this.idOportunity = idOportunity;
		this.name = name;
		this.telephone = telephone;
		this.email = email;
		this.is_client = is_client;
		this.contacts = contacts;
	}
	public Long getIdOportunity() {
		return idOportunity;
	}
	public void setIdOportunity(Long idOportunity) {
		this.idOportunity = idOportunity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getIs_client() {
		return is_client;
	}
	public void setIs_client(Boolean is_client) {
		this.is_client = is_client;
	}
	public List<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
}

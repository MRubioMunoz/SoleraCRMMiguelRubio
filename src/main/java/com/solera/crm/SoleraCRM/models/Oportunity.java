package com.solera.crm.SoleraCRM.models;

import java.util.ArrayList;

public class Oportunity {

	private Integer idOportunity;
	private String name;
	private String telephone;
	private String email;
	private Boolean client;
	private ArrayList<Contact> contacts;
	
	
	
	public Oportunity(Integer idOportunity, String name, String telephone, String email, Boolean client) {
		this.idOportunity = idOportunity;
		this.name = name;
		this.telephone = telephone;
		this.email = email;
		this.client = client;
		this.contacts = new ArrayList<>();
	}
	
	public Oportunity() {
		this.contacts = new ArrayList<>();
	}
	
	
	public Integer getIdOportunity() {
		return idOportunity;
	}
	public void setIdOportunity(Integer idOportunity) {
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
	public Boolean getClient() {
		return client;
	}
	public void setClient(Boolean client) {
		this.client = client;
	}
	public ArrayList<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(ArrayList<Contact> contacts) {
		this.contacts = contacts;
	}
}

package com.solera.crm.SoleraCRM.models;

import java.time.LocalDate;

public  class Contact{
		
	private Integer idContact;
	private String type;
	private LocalDate date;
	private Boolean result;
	private Integer idOportinuty;

	public Contact(Integer idContact, String type, LocalDate date, Boolean result, Integer idOportunity) {
		this.idContact = idContact;
		this.type = type;
		this.date = date;
		this.result = result;
		this.idOportinuty = idOportunity;
	}

	public Contact() {
	}

	public Integer getidContact() {
		return idContact;
	}

	public void setidContact(Integer idContact) {
		this.idContact = idContact;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Boolean getResult() {
		return result;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}

	public Integer getIdOportinuty() {
		return idOportinuty;
	}

	public void setIdOportinuty(Integer idOportinuty) {
		this.idOportinuty = idOportinuty;
	}


	
	
}
	
	
	

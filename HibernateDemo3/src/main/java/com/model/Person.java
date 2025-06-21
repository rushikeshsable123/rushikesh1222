package com.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	
	@Id
	private int id;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	private AdharCard adr;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AdharCard getAdr() {
		return adr;
	}

	public void setAdr(AdharCard adr) {
		this.adr = adr;
	}
	
	

}

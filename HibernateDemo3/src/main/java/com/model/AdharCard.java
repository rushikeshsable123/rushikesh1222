package com.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class AdharCard {
	
	@Id
	private int adharNo;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "adr")
	@JsonBackReference
	private Person p;
	
	
	public Person getP() {
		return p;
	}
	public void setP(Person p) {
		this.p = p;
	}
	public int getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(int adharNo) {
		this.adharNo = adharNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}

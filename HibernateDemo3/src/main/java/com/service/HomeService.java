package com.service;

import java.util.List;

import com.model.Person;

public interface HomeService {

	public String addperson(Person p);

	public List<Person> getpersonDetails();

}

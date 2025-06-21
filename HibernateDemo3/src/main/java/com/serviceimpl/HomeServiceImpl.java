package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Person;
import com.repository.PersonRepository;
import com.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	PersonRepository pr;
	@Override
	public String addperson(Person p) {

		pr.save(p);
		return "person Data sucessfully ...";
	}
	@Override
	public List<Person> getpersonDetails() {

		return (List<Person>) pr.findAll();
	}

}

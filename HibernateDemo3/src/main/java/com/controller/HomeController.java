package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Person;
import com.service.HomeService;

@RestController
public class HomeController {
	
	@Autowired
	HomeService hs;
	
	@PostMapping("/person")
	public String m1(@RequestBody Person p)
	{
		String msg=hs.addperson(p);

		System.out.println("person m1");
		return msg;	
	}
	
	@GetMapping("/persons")
	public List<Person> m2()
	{
		List<Person> list=hs.getpersonDetails();
		return list;
		
	}

}

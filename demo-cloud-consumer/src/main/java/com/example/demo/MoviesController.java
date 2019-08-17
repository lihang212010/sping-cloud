package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MoviesController {

	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/user/{id}")
	public Users findById(@PathVariable Long id) {
		return this.restTemplate.getForObject("http://localhost:8000/"+id, Users.class);
	}
	
}

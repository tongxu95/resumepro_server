package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Coach;

@RestController
@CrossOrigin (origins = "http://localhost:3000/")
@RequestMapping("/coaches")
public class CoachController {

	@Autowired
	private CoachRepo repo;
	
	@GetMapping("/findByCompany/{company}")
	public List<Coach> findByCompany(@PathVariable String company) {
		return repo.findByCompanyIgnoreCase(company);
	}
	
	@GetMapping("/findByTag/{tag}")
	public List<Coach> findByTag(@PathVariable String tag) {
		return repo.findByTagIgnoreCase(tag);
	}
	
	@GetMapping("/getCategories")
	public List<String> getCategories() {
		return repo.getCategories();
	}
	
}

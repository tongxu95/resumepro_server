package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.model.Coach;

@CrossOrigin (origins = "http://localhost:3000/")
@RepositoryRestResource
public interface CoachRepo extends JpaRepository <Coach, Long> {

	@Query("select c from Coach c where c.company = ?1")
	List<Coach> findByCompany(String company);
	
	@Query("select c from Coach c where c.tag = ?1")
	List<Coach> findByTag(String tag);
	
}

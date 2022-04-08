package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.model.Coach;

@CrossOrigin (origins = "http://localhost:3000/")
@RepositoryRestResource
public interface CoachRepo extends JpaRepository <Coach, Long> {

	List<Coach> findByCompanyIgnoreCase(String company);
	
	List<Coach> findByTagIgnoreCase(String tag);
	
	@Query("SELECT DISTINCT(c.tag) FROM Coach c")
	List<String> getCategories();
	
	@Override
	@RestResource(exported = false)
	void deleteById(Long aLong);
	
}

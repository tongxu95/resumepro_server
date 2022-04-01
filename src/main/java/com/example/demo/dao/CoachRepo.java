package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.model.Coach;

@CrossOrigin (origins = "http://localhost:3000/")
@RepositoryRestResource
public interface CoachRepo extends JpaRepository <Coach, Long> {

}

package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Coach;

@RepositoryRestResource
public interface CoachRepo extends JpaRepository <Coach, Long> {

}

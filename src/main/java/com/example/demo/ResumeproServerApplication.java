package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.CoachRepo;
import com.example.demo.model.Coach;

/*
 * Implements CommandlineRunner => runs after all the beans are created and registered
 */
@SpringBootApplication
public class ResumeproServerApplication implements CommandLineRunner {

	@Autowired
	private CoachRepo repo;
	
	public static void main(String[] args) {
		SpringApplication.run(ResumeproServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Coach newCoach = new Coach(1, "Olive Tree", "Product Manager at Orange", 5.0);
		newCoach.setRatings(new ArrayList<>(Arrays.asList(5.0, 4.0, 4.0, 4.0, 4.0)));
		this.repo.save(newCoach);
		
	}

}

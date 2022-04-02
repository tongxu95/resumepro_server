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
		Coach coach1 = new Coach("Olive Tree", "Product Manager", "Orange", "Product", 5.0);
		coach1.setRatings(new ArrayList<>(Arrays.asList(5.0, 4.0, 4.0, 4.0, 4.0)));
		this.repo.save(coach1);
		
		Coach coach2 = new Coach("Adam Tran", "Software Developer", "Orange", "Software", 15.0);
		coach2.setRatings(new ArrayList<>(Arrays.asList(3.0, 5.0, 2.0, 5.0)));
		this.repo.save(coach2);
		
		Coach coach3 = new Coach("Emmett Peterson", "Senior Consultant", "ABC", "Consulting", 5.0);
		this.repo.save(coach3);
	 
		Coach coach4 = new Coach("Clarence Patton", "HR Manager", "Vision", "HR", 10.0);
		this.repo.save(coach4);
		
		Coach coach5 = new Coach("Frank Harrison", "QA Engineer", "Orange", "Software", 10.0);
		this.repo.save(coach5);
		
		Coach coach6 = new Coach("Cheryl Byrd", "Senior Accountant", "ABC", "Accounting", 20.0);
		this.repo.save(coach6);
	 
		Coach coach7 = new Coach("Valerie Floyd", "Partner", "ABC", "Executive", 50.0);
		this.repo.save(coach7);
		
		Coach coach8 = new Coach("Bruce Arnold", "Business Analyst", "ABC", "Consulting", 1.0);
		this.repo.save(coach8);
		
		Coach coach9 = new Coach("Brent Allison", "Data Scientist", "Orange", "Data Science", 10.0);
		this.repo.save(coach9);
	}

}

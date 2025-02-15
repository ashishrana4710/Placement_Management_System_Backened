package com.example.placement.placementmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PlacementmanagementApplication {

	public static void main(String[] args) {
		ApplicationContext context =   SpringApplication.run(PlacementmanagementApplication.class, args);
	
	
	PlacmentRepo pr = context.getBean(PlacmentRepo.class);
	
	placement pm = new placement();
	pm.setName("Shiva");
	pm.setRoll(45);
	pm.setQualification("BE");
	pm.setCourse("CSE");
	pm.setYear(4);
	
	
	
	pr.save(pm);
	System.out.println("Data Insterted!!");
	
	pr.deleteAll();
	System.out.println("Data Deleted!!");
	}
	
	
	
	

}

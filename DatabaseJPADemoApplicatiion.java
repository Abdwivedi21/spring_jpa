package com.in28minutes.database.databasedemo;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.jdbc.PersonJDBC;
import com.in28minutes.database.databasedemo.jpa.PersonJpaRepository;
import com.in28minutes.database.databasedemo.jpa.PersonRepo;

@SpringBootApplication

public class DatabaseJPADemoApplicatiion implements CommandLineRunner{

	Logger log=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	
	PersonJpaRepository personJDBC;
	//PersonRepo personrepo;
	public static void main(String[] args) {
		ApplicationContext ap=SpringApplication.run(DatabaseJPADemoApplicatiion.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		log.info("listusing JPA -->{}",	personJDBC.findbyId(10001));//.getById((long) 10001));
		
		
	}

}

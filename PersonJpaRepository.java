package com.in28minutes.database.databasedemo.jpa;

import javax.persistence.EntityManager;
//import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.in28minutes.database.databasedemo.entity.Person;

@Repository
@Transactional

public class PersonJpaRepository {

	@PersistenceContext
	EntityManager entity;
	
	public Person findbyId(int id)
	{
		return entity.find(Person.class, id);
		
	}
	
}

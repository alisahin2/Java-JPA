package models;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");
		
		EntityManager entityManager = factory.createEntityManager();
		
		
		/*
		 // insert person query
		 
		EntityTransaction transaction = entityManager.getTransaction();
		
		Persons person = new Persons(1, "second", "second", new Date(), "about of second", 2852);
		
		transaction.begin();
		
		entityManager.persist(person);
		
		transaction.commit();
		
		*/
		
		
		/*
		// select query
		Persons selectedPersonById = entityManager.find(Persons.class, 1);

		if (selectedPersonById !=null) {
			System.out.println("id: " + selectedPersonById.getId());
			System.out.println("first name: " + selectedPersonById.getFirstName());
			System.out.println("last name: " + selectedPersonById.getLastName());
			System.out.println("birth of date: " + selectedPersonById.getBirthOfDate());
			System.out.println("salary: " + selectedPersonById.getSalary());
		}
		else {
			System.out.println(" person not found");
		}
		*/
		
		
		/*
		// update person query
		EntityTransaction transaction = entityManager.getTransaction(); // work while inserting and updating
		
		Persons selectedPersonById = entityManager.find(Persons.class, 1); //person selector
		
		selectedPersonById.setSalary(6666);
		
		transaction.begin();
		
		entityManager.merge(selectedPersonById);
		
		transaction.commit();
		*/
		
		
		/*
		//delete person query
		EntityTransaction transaction = entityManager.getTransaction(); // work while inserting and updating
		
		Persons selectedPersonById = entityManager.find(Persons.class, 1); //person selector
		
		transaction.begin();
		
		entityManager.remove(selectedPersonById);
		
		transaction.commit();
		
		*/
		
		
		
	}

}

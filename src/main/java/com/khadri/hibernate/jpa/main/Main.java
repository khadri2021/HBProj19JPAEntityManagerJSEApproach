package com.khadri.hibernate.jpa.main;

import javax.persistence.EntityManager;

import com.khadri.hibernate.jpa.entities.Car;
import com.khadri.hibernate.jpa.jse.application.JseEntityManagerFactory;

public class Main {

	public static void main(String[] args) {

		EntityManager entityManager = JseEntityManagerFactory
				.prepareEntityManager();

		entityManager.getTransaction().begin();

		Car car = new Car();
		car.setCarName("Titanium");
		car.setCarCompany("Ford");

		entityManager.persist(car);

		entityManager.getTransaction().commit();
		entityManager.close();
		 

	}
}

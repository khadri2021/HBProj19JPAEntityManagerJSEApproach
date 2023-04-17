package com.khadri.hibernate.jpa.jse.application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*  
 * JSE Application approach to obtain EntityManager
 *
 * 
 */
public class JseEntityManagerFactory {

	private static EntityManagerFactory entityManagerFactory;

	public static EntityManager prepareEntityManager() {

		entityManagerFactory = Persistence
				.createEntityManagerFactory("PERSISTENCE_UNIT_MYSQL");
		return entityManagerFactory.createEntityManager();
	}
}

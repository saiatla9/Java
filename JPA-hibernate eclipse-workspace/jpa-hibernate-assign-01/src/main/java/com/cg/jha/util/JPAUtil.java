package com.cg.jha.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory emFactory;
	
	static {
		emFactory = Persistence.createEntityManagerFactory("postgrePU");
	}
	
	public static EntityManager getEntityManager() {
		return emFactory.createEntityManager();
	}
}
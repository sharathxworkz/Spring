package com.xworkz.nirmala.dao;

import com.xworkz.nirmala.entity.NirmalaEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NirmalaDAOImpl implements NirmalaDAO  {
	
	@Autowired
	EntityManagerFactory factory;
	EntityManager manager = null;
	
	public Boolean save(NirmalaEntity entity) {

		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(entity);
			tx.commit();
		}
		catch(PersistenceException p) {
			p.printStackTrace();
		}
		finally {
			
			manager.close();
		}
		return null;
	}


}


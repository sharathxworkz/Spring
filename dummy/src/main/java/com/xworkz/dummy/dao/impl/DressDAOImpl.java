package com.xworkz.dummy.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.dummy.dao.DressDAO;
import com.xworkz.dummy.dto.ShirtDTO;

@Repository
public class DressDAOImpl implements DressDAO{

	@Autowired
	private EntityManagerFactory factory;
	EntityManager manager = null;
	
	@Override
	public Boolean save(ShirtDTO shirt) {
		
		try {
		manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(shirt);
		transaction.commit();
		}
		catch(PersistenceException p) {
			p.printStackTrace();
		}
		finally{
			manager.close();
		}
		return true;
	}

}

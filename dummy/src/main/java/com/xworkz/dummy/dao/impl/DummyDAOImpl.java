package com.xworkz.dummy.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.dummy.dao.DummyDAO;
import com.xworkz.dummy.dto.DummyDTO;

@Repository
public class DummyDAOImpl implements DummyDAO {

	@Autowired
	private EntityManagerFactory factory;
	
	
	@Override
	public void save(DummyDTO dummy) {
		System.out.println("Calling DAO Save Method");
		EntityManager createEntityManager = factory.createEntityManager();
		
		try {
			EntityTransaction transaction = createEntityManager.getTransaction();
			transaction.begin();
			createEntityManager.persist(dummy);
			transaction.commit();
		}
		catch(PersistenceException p) {
			System.out.println("exception in save dao" + p.getMessage());
			p.printStackTrace();
		}
		finally {
			createEntityManager.close();
		}
	}

}

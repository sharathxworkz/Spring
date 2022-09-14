package com.xworkz.metro.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.metro.entity.MetroEntity;
import static com.xworkz.metro.util.EMFUtil.*;

public class MetroDAOImpl implements MetroDAO{

	EntityManagerFactory factory = getFactory();
	
	public Boolean save(List<MetroEntity> entities) {
	
		EntityManager manager =null;
		
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			for (MetroEntity metroEntity : entities) {
				manager.persist(metroEntity);
			}
			tx.commit();
		} 
		catch (PersistenceException p) {
			p.printStackTrace();
		}
		finally {
			manager.close();
		}
		return null;
	}

}

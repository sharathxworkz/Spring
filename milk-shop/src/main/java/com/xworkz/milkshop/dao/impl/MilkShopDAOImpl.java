package com.xworkz.milkshop.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.milkshop.dao.MilkShopDAO;
import com.xworkz.milkshop.dto.MilkShopDTO;

@Repository
public class MilkShopDAOImpl implements MilkShopDAO {

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public void save(MilkShopDTO milk) {
		System.out.println("Calling Save Method Of MilkShopDAO");
		 EntityManager createEntityManager = factory.createEntityManager();

		try {
			
			 EntityTransaction transaction = createEntityManager.getTransaction();
			 transaction.begin();
			 createEntityManager.persist(milk);
			 transaction.commit();

		} catch (PersistenceException e) {
			System.out.println("exception in save dao" + e.getMessage());
		}
		finally {
			createEntityManager.close();
		}

	}

}

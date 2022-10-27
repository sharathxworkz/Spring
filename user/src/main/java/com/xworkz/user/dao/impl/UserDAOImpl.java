package com.xworkz.user.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.user.dao.UserDAO;
import com.xworkz.user.dto.UserDTO;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private EntityManagerFactory factory;
	private EntityManager manager = null;

	@Override
	public Boolean save(UserDTO userDTO) {
		manager = factory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(userDTO);
			transaction.commit();
		} catch (PersistenceException p) {
			p.printStackTrace();
		} finally {
			manager.close();
		}
		return true;
	}

	@Override
	public List<UserDTO> findAll() {
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAll");
			List<UserDTO> list = query.getResultList();
			if(list != null) {
				return list;
			}
		}
		catch(PersistenceException p) {
			p.printStackTrace();
		}
		finally {
			manager.close();
		}
		return null;
	}

	@Override
	public List<UserDTO> findByName(String name) {
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findByName");
			query.setParameter("nm", name);
			List<UserDTO> resultList = query.getResultList();
			return resultList;
		}
		catch(PersistenceException p){
			p.printStackTrace();
		}
		finally {
			manager.close();
		}
		return null;
	}

}

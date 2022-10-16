package com.xworkz.dummy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.dummy.dao.DummyDAO;
import com.xworkz.dummy.dao.impl.DummyDAOImpl;
import com.xworkz.dummy.dto.DummyDTO;
import com.xworkz.dummy.service.DummyService;

@Service
public class DummyServiceImpl implements DummyService {

	@Autowired
	private DummyDAO dummyDAO;
	
	public DummyServiceImpl() {
		System.out.println("Calling Default Constructor of:"+this.getClass().getSimpleName());
	}
	
	@Override
	public Boolean validateAndSave(DummyDTO dummy) {
		System.out.println("Calling Service Save Method");
		System.out.println("*****************************");
		System.out.println("Details Received Are:" + dummy);
		dummyDAO.save(dummy);
		return true;
	}
}
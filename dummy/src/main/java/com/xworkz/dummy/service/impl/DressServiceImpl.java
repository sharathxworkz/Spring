package com.xworkz.dummy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.dummy.dao.DressDAO;
import com.xworkz.dummy.dto.ShirtDTO;
import com.xworkz.dummy.service.DressService;
@Service
public class DressServiceImpl implements DressService {

	@Autowired
	private DressDAO dressDAO;
	
	@Override
	public Boolean validateAndSave(ShirtDTO shirt) {
		System.out.println("Calling validateAndSave Method");
		dressDAO.save(shirt);
		return true;
	}

}

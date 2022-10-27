package com.xworkz.user.service.impl;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.user.dao.UserDAO;
import com.xworkz.user.dto.UserDTO;
import com.xworkz.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public Boolean validateAndSave(UserDTO userDTO) {
		System.out.println("calling validateAndSave Method");
		
	System.out.println("Details Entered Are Valid");
			Boolean save = userDAO.save(userDTO);
			System.out.println(save);
		return true;
		
	}	
	
	@Override
	public List<UserDTO> findAll() {
		System.out.println("Calling FindAll Method");
		return this.userDAO.findAll();
	}

	@Override
	public List<UserDTO> findByName(String name) {
		return userDAO.findByName(name);
	
	}

}

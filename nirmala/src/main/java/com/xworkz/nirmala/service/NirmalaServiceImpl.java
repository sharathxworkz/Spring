package com.xworkz.nirmala.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.nirmala.dao.NirmalaDAO;
import com.xworkz.nirmala.entity.NirmalaEntity;

@Component
public class NirmalaServiceImpl implements NirmalaService{

	@Autowired
	NirmalaDAO dao;
	
	public Boolean save(NirmalaEntity entity) {
	
		ValidatorFactory buildDefaultValidatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = buildDefaultValidatorFactory.getValidator();
		Set<ConstraintViolation<NirmalaEntity>> validate = validator.validate(entity);
		if(validate.size() > 0) {
			System.err.println("Invaid");
		}
		else {
			System.out.println("valid");
			return dao.save(entity);
			
		}
		return false;
	}

}

package com.xworkz.criminal.service.impl;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.criminal.dao.CriminalDAO;
import com.xworkz.criminal.dto.CriminalDTO;
import com.xworkz.criminal.service.CriminalService;

@Service
public class CriminalServiceImpl implements CriminalService {

	@Autowired
	private CriminalDAO criminalDAO;
	
	public CriminalServiceImpl() {
	
		System.out.println("Calling Default Constructor of:"+this.getClass().getSimpleName());
	}
	
	@Override
	public Boolean validateAndSave(CriminalDTO criminal) {
		System.out.println("Calling ");
		if(criminal.getCriminalName() != null & criminal.getCriminalAge() != null & criminal.getCriminalType() != null & criminal.getNetWorth() != null) {
		System.out.println("Entered Details Are Valid");
		criminalDAO.save(criminal);
		return true;
	}
		
		else {
			
			System.out.println("Entered Details Are Invalid");
		}
		return null;
	}

	@Override
	public List<CriminalDTO> findAll() {
		System.out.println("Calling FindAll Method Of Service");
		List<CriminalDTO> findAll = criminalDAO.findAll();
		return findAll;
	}
	
	public List<CriminalDTO> findByName(String name){
		System.out.println("Calling findByName");
		ValidatorFactory validator = Validation.buildDefaultValidatorFactory();
		Validator validate = validator.getValidator();
		Set<ConstraintViolation<String>> validate2 = validate.validate(name);
		if(validate2.size()>0) {
			System.out.println("Invalid Name Emtered");
		}
		else {
			System.out.println("Entered Details Are Valid");
			return criminalDAO.findByName(name);
		}
		return null;
	}

	@Override
	public List<CriminalDTO> findByAgeCountryGender(String age, String country, String gender) {
		System.out.println("Calling findByAgeCountryGender");
		ValidatorFactory validator = Validation.buildDefaultValidatorFactory();
		Validator validate = validator.getValidator();
		Set<ConstraintViolation<String>> val1 = validate.validate(age);
		Set<ConstraintViolation<String>> val2 = validate.validate(country);
		Set<ConstraintViolation<String>> val3 = validate.validate(gender);
		
		if(val1.size()>0 & val2.size()>0 & val3.size()>0) {
			System.out.println("Details Entered Are Invalid");
		}
		else {
			System.out.println("Details Entered Are Valid");
			return criminalDAO.findByAgeCountryGender(age, country, gender);
		}
		return null;
	}
}

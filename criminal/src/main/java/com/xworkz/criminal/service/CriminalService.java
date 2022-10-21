package com.xworkz.criminal.service;

import com.xworkz.criminal.dto.CriminalDTO;
import java.util.*;

public interface CriminalService {

	public Boolean validateAndSave(CriminalDTO criminal);
	public List<CriminalDTO> findAll();
	public List<CriminalDTO> findByName(String name);
	public List<CriminalDTO> findByAgeCountryGender(String age,String country,String gender);
}

package com.xworkz.criminal.dao;

import java.util.List;

import com.xworkz.criminal.dto.CriminalDTO;

public interface CriminalDAO {

	public void save(CriminalDTO criminal);
	public List<CriminalDTO> findAll();
	public List<CriminalDTO> findByName(String name);
}

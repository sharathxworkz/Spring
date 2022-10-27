package com.xworkz.user.dao;

import java.util.List;

import com.xworkz.user.dto.UserDTO;

public interface UserDAO {

	public Boolean save(UserDTO userDTO);
	public List<UserDTO> findAll();
	public List<UserDTO> findByName(String name); 
}

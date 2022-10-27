package com.xworkz.user.service;

import java.util.List;

import com.xworkz.user.dto.UserDTO;

public interface UserService {

	public Boolean validateAndSave(UserDTO userDTO);
	public List<UserDTO> findAll();
	public List<UserDTO> findByName(String name); 
}

package com.xworkz.exceptions.dao;

import com.xworkz.exceptions.AtmException;

public interface AtmDAO {

 public void withdrawal(Integer amount) throws AtmException;
 public void swipetimes(Integer times) throws AtmException;
 public void enterAmount(Integer amount);
 
}

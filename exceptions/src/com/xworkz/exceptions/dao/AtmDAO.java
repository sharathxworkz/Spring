package com.xworkz.exceptions.dao;

import com.xworkz.exceptions.AtmException;
import com.xworkz.exceptions.AtmRunTimeException;

public interface AtmDAO {

 public Boolean withdrawal(Integer amount) throws AtmException;
 public Boolean invalidAmount(Integer amount) throws AtmRunTimeException;
 
}

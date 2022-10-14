package com.xworkz.exceptions.dao;

import com.xworkz.exceptions.AtmException;
import com.xworkz.exceptions.AtmRunTimeException;

public class AtmDAOImpl implements AtmDAO{

	@Override
	public Boolean withdrawal(Integer amount) throws AtmException {
		
		if(amount <= 30000) {
			System.out.println("Please Wait For The Cash and Collect Your Card ");
			return true;
		}
		else {
			System.out.println("Entered exception");
			throw new AtmException("Amount Entered Exceeds the Limit");
		}

	}

	@Override
	public Boolean invalidAmount(Integer amount)throws AtmRunTimeException {
		
		if(amount > 100 & amount<=30000) {
			System.out.println("Entered Amount is Valid Wait for the Cash");
			return true;
		}
		else {
			System.out.println("invalid");
			throw new AtmRunTimeException("Amount Entered is Invalid");
		}
		
	}

}

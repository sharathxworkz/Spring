package com.xworkz.exceptions.runner;

import com.xworkz.exceptions.AtmException;
import com.xworkz.exceptions.AtmRunTimeException;
import com.xworkz.exceptions.dao.AtmDAO;
import com.xworkz.exceptions.dao.AtmDAOImpl;

public class AtmRunner {

	public static void main(String[] args)  {
		
		AtmDAO atm = new AtmDAOImpl();
//		atm.withdrawal(5000);
		try {
		atm.invalidAmount(50);
		}
		catch (AtmRunTimeException at) {
			System.out.println(at.getClass());
		}
		System.out.println("Get The Amount");
	}

}

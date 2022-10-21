package com.xworkz.exceptions.runner;

import com.xworkz.exceptions.AtmException;
import com.xworkz.exceptions.AtmRunTimeException;
import com.xworkz.exceptions.dao.AtmDAO;
import com.xworkz.exceptions.dao.AtmDAOImpl;

public class AtmRunner {

	public static void main(String[] args)   {
		
		AtmDAO atm = new AtmDAOImpl();
		
		try {
			atm.swipetimes(4);
			System.out.println("executing after swipe");
			atm.withdrawal(50000);
			atm.swipetimes(4);
		} catch (AtmException e1) {
			System.out.println("comming to main catch block");
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
		}
		
		
	}

}

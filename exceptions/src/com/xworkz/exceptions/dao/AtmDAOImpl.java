package com.xworkz.exceptions.dao;

import com.xworkz.exceptions.AtmException;
import com.xworkz.exceptions.AtmRunTimeException;

public class AtmDAOImpl implements AtmDAO{

	AtmException atm = new AtmException();
	AtmRunTimeException atmExcp	= new AtmRunTimeException();
	
	@Override
	public void withdrawal(Integer amount) throws AtmException  {
		
		System.out.println("Calling Withdrawal Method");
		if(amount >30000) {
			throw atm;
		}
		
		else {
			System.out.println("Wait For The Cash And Collect Your Card");
		}
	}

	@Override
	public void swipetimes(Integer times) throws AtmException {
		System.out.println("Calling swipeTimesExceded Method");
		if(times > 3) {
			throw atm;
		}
		
		else {
			System.out.println("Wait For The Cash And Collect Your Card");
		}
		
	}

	@Override
	public void enterAmount(Integer amount) {

		System.out.println("Calling invalidAmount Method");
		if(amount < 50 ) {
			throw atmExcp;
		}
		
		else {
			System.out.println("Wait For The Cash And Collect Your Card");
		}
		
	}



}

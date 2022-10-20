package com.xworkz.exceptions;

public class AtmException extends Exception{

	public AtmException() {
		
		System.out.println("Calling Default Constructor of"+ this.getClass().getSimpleName());
	}
		
	public void amountLimitExceded() {
		
		System.out.println("The Amount Exceeded Your Daily Limit");
	} 
	
	public void timesExceded() {
		
		System.out.println("Card Swipe Limit Exceded!!");
	}

}

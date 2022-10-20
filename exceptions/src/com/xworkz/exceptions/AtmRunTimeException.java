package com.xworkz.exceptions;

public class AtmRunTimeException extends RuntimeException {
	
	
public AtmRunTimeException() {
	
	System.out.println("Calling Default Constructor of"+ this.getClass().getSimpleName());
}
	
public void invalidAmount() {
	
	System.out.println("Add a Valid Amount for withdrawl");
}
}

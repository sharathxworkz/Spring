package com.xworkz.Athletics.bridge;

public class GymStaff {

	private GymRules gymrule;
	
	public GymStaff(GymRules gymrule) {
		System.out.println("Called Default Constructor");
		this.gymrule = gymrule;
	}
	
	public void checkRules() {
		System.out.println("Rules Are Being checkedr");
		Boolean shoe = gymrule.wareShoes();
		Boolean uni = gymrule.unisex();
		Double fee = gymrule.monthlyfees();
		
		if(shoe && fee >350 && uni) {
			System.out.println("Rules Are Followed");
		}
		else {
			System.out.println("Rules Are Not Follwed");
		}
	}
	
	public void maintainance() {
		System.out.println("Gym is under maintainance");
		
	}
}

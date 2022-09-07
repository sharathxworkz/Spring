package com.xworkz.Athletics.bridge;

public class GymRuleRunner {

	public static void main(String[] args) {

		GymRules rules = new PrajwalGymRules();
		
		GymStaff staff = new GymStaff(rules);
		staff.checkRules();
		staff.checkRules();

	}

}

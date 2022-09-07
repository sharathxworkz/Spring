package com.xworkz.Athletics.bridge;

public class PrajwalGymRules implements GymRules{

	@Override
	public Boolean wareShoes() {
		System.out.println("wearing Shoes");
		return true;
	}

	@Override
	public Boolean unisex() {
		System.out.println("Yes it is Unisex");
		return true;
	}

	@Override
	public Double monthlyfees(){
		System.out.println("Fees Paid");
		return 400D;
	}

	
}

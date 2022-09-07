package com.xworkz.cricket.inter;

public class Cricketers implements CricketRules {

	@Override
	public Boolean oversCompleted() {
		System.out.println("Yes Overs Were Completed");
		return true;
	}

	@Override
	public Float completedTime() {
		System.out.println("The Match was completed Within The Duration!");
		return 4.5f;
	}

	@Override
	public Boolean cheated() {
		System.out.println("Match was Complete Crystal Clear");
		return true;
	}

	@Override
	public Boolean playerPayed() {
		System.out.println("Yes They Were Payed!");
		return true;
	}

}

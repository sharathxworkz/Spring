package com.xworkz.cricket.runner;

import com.xworkz.cricket.inter.CricketRules;
import com.xworkz.cricket.inter.Cricketers;
import com.xworkz.cricket.inter.IccBoard;

public class CricketRulesRunner {

	public static void main(String[] args) {
		
		CricketRules rules = new Cricketers();
		
		IccBoard board = new IccBoard("Indian Cricket Council", "Banglore", rules);
		board.rulesFollowed();
		board.paymentMade();
	}
}

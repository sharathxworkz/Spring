package com.xworkz.cricket.inter;

public class IccBoard {
	
	private String boardName;
	private String location;
	private CricketRules rules;
	
	public IccBoard(String boardName, String location, CricketRules rules ) {
		this.boardName = boardName;
		this.location = location;
		this.rules = rules;	
	}
	
	public void rulesFollowed() {
		
		System.out.println("The Game is being Verified!");
		Boolean overscompleted = rules.oversCompleted();  
		Float time = rules.completedTime();
		Boolean cheat = rules.cheated();
		
		if(overscompleted && cheat && time <= 4.5f) {
			System.out.println("Rules Were Followed!!");
		}
		else {
			System.out.println("Rules Were Not Followed!");
		}
	}
	
	public void paymentMade() {
		
		Boolean pay = rules.playerPayed();
		if(pay) {
			System.out.println("The payment Was Made");
		}
		else {
			System.out.println("Payment Was Not Payed!!!");
		}
	}

}

package com.xworkz.musicAndFood.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class FoodDTO {

	private String foodName;
	private String price;
	private String hotelName;
	private String location;
	private String order;
	private String quantity;
	
	public FoodDTO() {
		
		System.out.println("Calling Default Constructor of:"+ this.getClass().getSimpleName());
	}
	
}

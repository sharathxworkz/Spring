package com.xworkxz.noOfSuperCars.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SuperCarDTO {

	private String cName;
	private String nName;
	private String manufacture;
	private String cost;
	
	
	public SuperCarDTO() {
	
		System.out.println("Calling Default Constructor of:"+this.getClass().getSimpleName());
	}
}

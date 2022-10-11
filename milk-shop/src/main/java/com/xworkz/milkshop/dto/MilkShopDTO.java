package com.xworkz.milkshop.dto;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter
@Setter
@ToString

public class MilkShopDTO {

	private Integer id;
	private String name;
	private String brand;
	private String owner;
	private String ambassador;
	
	public MilkShopDTO() {
		
		System.out.println("calling Default Constructor of:"+ this.getClass().getSimpleName());
	}
	
}

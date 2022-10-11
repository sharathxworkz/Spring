package com.xworkz.country.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class PersonDTO {

	private String name;
	private String email;
	private String cities;
	
	public PersonDTO() {
		System.out.println("Calling default Constructor of:"+this.getClass().getSimpleName());
	}
	
}

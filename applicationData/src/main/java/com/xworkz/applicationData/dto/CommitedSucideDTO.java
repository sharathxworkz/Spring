package com.xworkz.applicationData.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter

public class CommitedSucideDTO implements Serializable{

	private String name;
	private Integer age;
	private String reason;
	private String gender;
	private Integer attempts;
	private String spot;
	private String dateAndTime;
	private String type;
	
	
	public CommitedSucideDTO() {
		
		System.out.println("Calling Default Constructor of:"+this.getClass().getSimpleName());
	}



	
}	
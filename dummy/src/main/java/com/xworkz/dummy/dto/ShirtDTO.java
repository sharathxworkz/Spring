package com.xworkz.dummy.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name = "branddata")
@ToString
@AllArgsConstructor

public class ShirtDTO {
	
	@Id
	@GenericGenerator(name="dress", strategy = "increment")
	@GeneratedValue(generator = "dress")
	private Integer bid;
	private String brand;
	private String size;
	private String price;
	private String discount;
	private String quantity;
	private String gender;
	private String color;
	
	public ShirtDTO() {
		System.out.println("Calling Default Constructor of:"+this.getClass().getSimpleName());
	}
}

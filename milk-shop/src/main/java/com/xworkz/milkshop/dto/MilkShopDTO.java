package com.xworkz.milkshop.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter
@Setter
@ToString
@Entity
@Table(name = "MILK_SHOP")
public class MilkShopDTO {

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	private Integer id;
	private String name;
	private String brand;
	private String owner;
	private String ambassador;

	public MilkShopDTO() {

		System.out.println("calling Default Constructor of:" + this.getClass().getSimpleName());
	}

}

package com.xworkz.criminal.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "criminal")
@NamedQueries({ @NamedQuery(name = "findAll", query = "select criminal from CriminalDTO criminal"),
	@NamedQuery(name="findByName", query="select criminal from CriminalDTO criminal where criminal.criminalName=:nm")})

public class CriminalDTO {

	@Id
	@GenericGenerator(name = "crime", strategy = "increment")
	@GeneratedValue(generator = "crime")
	private Integer cId;
	@Min(value=3)
	@Max(value=10)
	private String criminalName;
	private String criminalAge;
	private String country;
	private String criminalType;
	private String noOfCases;
	private String alive;
	private String gender;
	private String international;
	private String married;
	private String jailTerm;
	private String wifeName;
	private String rightHandName;
	private String leftHandName;
	private String prisonName;

	private String netWorth;

	public CriminalDTO() {

		System.out.println("Calling Default Constructor of:" + this.getClass().getSimpleName());
	}
}

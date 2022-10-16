package com.xworkz.nirmala.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString (callSuper = true)
@Entity
@Table (name = "nirmal")

public class NirmalaEntity extends BasicEntity {

	@Id
	@GenericGenerator (name = "man", strategy = "increment")
	@GeneratedValue (generator = "man")
	@Min(value = 1)
	private Integer nId;
	@NotNull
	private String location;
	@NotNull
	private String gender;
	@NotNull
	private String type;
	@Min(value = 1)
	private double cost;
	@NotNull
	private LocalTime duration;

	public NirmalaEntity(String location, String gender, String type, double cost, LocalTime duration,LocalDate createdDate, String createdBy, LocalDate updatedDate, String updatedBy) {
		
		super(createdDate, createdBy, updatedDate, updatedBy);
		this.location = location;
		this.gender = gender;
		this.type = type;
		this.cost = cost;
		this.duration = duration;
	}
}

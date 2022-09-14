package com.xworkz.metro.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Setter
@Getter
@ToString (callSuper = true)
@Table (name ="metro_details")

public class MetroEntity extends BasicEntity{

	
	@Id
	private Integer trainId;
	private String tainColor;
	private String laneColor;
	private Double ticketPrice;
	
	public MetroEntity( Integer id, String tainColor,
			String laneColor, Double ticketPrice, LocalDate created_at, String createdBy, LocalDate updated_at, String updatedBy) {
		
		super(created_at, createdBy, updated_at, updatedBy);
		this.trainId=id;
		this.tainColor = tainColor;
		this.laneColor = laneColor;
		this.ticketPrice = ticketPrice;
	}
	
	
	
	
}

package com.xworkz.nirmala.entity;


import java.time.LocalDate;

import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@ToString
public class BasicEntity {

	private LocalDate createdDate;
	private String createdBy;
	private LocalDate updatedDate;
	private String updatedBy;
	

}

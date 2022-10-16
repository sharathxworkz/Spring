package com.xworkz.dummy.dto;

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
@Setter
@Getter
@ToString
@Entity
@Table(name = "dummy")
public class DummyDTO {

	@Id
	@GenericGenerator(name="df", strategy = "increment")
	@GeneratedValue(generator = "df")
	public Integer id;
	public String uName;
	public String mail;
	public String password;
	public String phNo;
	
	public DummyDTO() {
		
		System.out.println("Calling Default Constructor of:"+this.getClass().getSimpleName());
	}
}

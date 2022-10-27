package com.xworkz.user.dto;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="userdata")

@NamedQueries({@NamedQuery(name="findAll", query="select user from UserDTO user"),
@NamedQuery(name="findByName", query="select user from UserDTO user where user.userName=:nm")})

public class UserDTO {

@Id
@GenericGenerator(name = "users", strategy = "increment")
@GeneratedValue(generator = "users")

private Integer id;
private String userName;
private String userEmail;
private String fileName;

public UserDTO() {
	System.out.println("Calling Default Constructor of:"+ this.getClass().getSimpleName());
}

}

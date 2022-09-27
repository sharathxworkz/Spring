package com.xworkz.job.dto;

import java.util.List;

public class JobApplicationDTO {

	private String name;
	private String email;
	private Long phoneNo;
	private Long alPhoneNo;
	private String gender;
	private String qualification;
	private String yop;
	private String university;
	private String address;
	private List skills;
	private Double ctc;
	private String experience;
	private String idProof;
	private String num;
	
	public JobApplicationDTO() {
		System.out.println("The Default Constructor");
	}

	public JobApplicationDTO(String name, String email, Long phoneNo, Long alPhoneNo, String gender,
			String qualification, String yop, String university, String address, List skills, Double ctc,
			String experience, String idProof, String num) {
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.alPhoneNo = alPhoneNo;
		this.gender = gender;
		this.qualification = qualification;
		this.yop = yop;
		this.university = university;
		this.address = address;
		this.skills = skills;
		this.ctc = ctc;
		this.experience = experience;
		this.idProof = idProof;
		this.num = num;
	}

	@Override
	public String toString() {
		return "JobApplicationDTO [name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + ", alPhoneNo="
				+ alPhoneNo + ", gender=" + gender + ", qualification=" + qualification + ", yop=" + yop
				+ ", university=" + university + ", address=" + address + ", skills=" + skills + ", ctc=" + ctc
				+ ", experience=" + experience + ", idProof=" + idProof + ", num=" + num + "]";
	}

	
	

	
	
}

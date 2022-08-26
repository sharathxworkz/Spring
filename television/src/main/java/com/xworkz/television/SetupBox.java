package com.xworkz.television;

public class SetupBox {
	
	private String companyName;

	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	@Override
	public String toString() {
		return "SetupBox [companyName=" + companyName + "]";
	}


	public SetupBox(String companyName) {
		this.companyName = companyName;
	}


	public SetupBox() {
		System.out.println(this.getClass().getSimpleName()+"Bean Created");
	}
	

}

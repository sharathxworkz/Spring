package com.xworkz.television;

public class Stand {
	
	private String standMaterial;

	public String getStandMaterial() {
		return standMaterial;
	}


	public void setStandMaterial(String standMaterial) {
		this.standMaterial = standMaterial;
	}


	public Stand() {
		System.out.println(this.getClass().getSimpleName()+"Bean Created");
	}
	
	
	public Stand(String standMaterial) {
		this.standMaterial = standMaterial;
	}


	@Override
	public String toString() {
		return "Stand [standMaterial=" + standMaterial + "]";
	}
	
	

}

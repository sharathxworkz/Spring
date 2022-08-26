package com.xworkz.television;

public class Display {

	private String type;

	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Display() {
		System.out.println(this.getClass().getSimpleName()+"Bean Created");
	}
	
	public Display(String type) {
		this.type = type;
		System.out.println(this.getClass().getSimpleName()+"Bean Created");
	}
	
	@Override
	public String toString() {
		return "Display [type=" + type + "]";
	}
	
	
}

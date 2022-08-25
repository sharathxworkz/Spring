package com.xworkz.football;

public class Basketball {
	
private String brandName;
private Boolean airFilled;

public String getBrandName() {
	return brandName;
}
public void setBrandName(String brandName) {
	this.brandName = brandName;
}
public Boolean getAirFilled() {
	return airFilled;
}
public void setAirFilled(Boolean airFilled) {
	this.airFilled = airFilled;
}

public Basketball() {
	
	System.out.println(this.getClass().getSimpleName()+ " Bean Created");
}

public Basketball(String name, Boolean airFilled) {
	
	this.brandName = name;
	this.airFilled = airFilled;
	
	System.out.println(this.getClass().getSimpleName()+ " Bean Created");
}


@Override
public String toString() {
	return "Basketball [brandName=" + brandName + ", airFilled=" + airFilled + "]";
}

}

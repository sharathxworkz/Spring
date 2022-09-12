package com.xworkz.sweingmachine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Tailormachine {

	
	private String brandName;
	
	private String color;

	private Double price;
	
	private String material;
	
	private Double warrenty;
    //@Autowired
	private GearWheels wheels;
	//@Autowired
	private Lubicants type;

	public Tailormachine() {
		System.out.println("Bean created" + this.getClass().getSimpleName());

	}

	public String getBrandName() {
		return brandName;
	}

	@Value("${BrandName}")
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getColor() {
		return color;
	}
	@Value("${color}")
	public void setColor(String color) {
		this.color = color;
	}

	public Double getPrice() {
		return price;
	}

	@Value("${cost}")
	public void setPrice(Double price) {
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}
	
	@Value("Metarial")
	public void setMaterial(String material) {
		this.material = material;
	}

	public Double getWarrenty() {
		return warrenty;
	}

	@Value("3.50D")
	public void setWarrenty(Double warrenty) {
		this.warrenty = warrenty;
	}

	public GearWheels getWheels() {
		return wheels;
	}

	@Autowired
	public void setWheels(GearWheels wheels) {
		this.wheels = wheels;
	}

	public Lubicants getType() {
		return type;
	}

	@Autowired
	public void setType(Lubicants type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Tailormachine [brandName=" + brandName + ", color=" + color + ", price=" + price + ", material="
				+ material + ", warrenty=" + warrenty + ", wheels=" + wheels + ", type=" + type + "]";
	}
	
	
}


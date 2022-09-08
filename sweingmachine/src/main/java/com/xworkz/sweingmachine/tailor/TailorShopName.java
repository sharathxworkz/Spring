package com.xworkz.sweingmachine.tailor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TailorShopName {

	@Value("Shadow Fashions")
	private String shopName;
	@Value("Soulsars")
	private String location;
	@Autowired
	private ShopWorkers worker;

	public TailorShopName() {
		System.out.println("The TailorShop Bean has been Created" + this.getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "TailorShopName [shopName=" + shopName + ", location=" + location + ", worker=" + worker + "]";
	}
	
	

}

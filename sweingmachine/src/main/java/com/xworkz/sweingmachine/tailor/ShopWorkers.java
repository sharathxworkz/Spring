package com.xworkz.sweingmachine.tailor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ShopWorkers {

	@Value("77")
	private Integer noOfWorkers;
	@Value("7")
	private Integer noOfDept;
	@Value("Brown")
	private String uniform;
	
	
	public ShopWorkers() {
		System.out.println("ShopWorkers Bean Created" + this.getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "ShopWorkers [noOfWorkers=" + noOfWorkers + ", noOfDept=" + noOfDept + ", uniform=" + uniform + "]";
	}

	
	
}

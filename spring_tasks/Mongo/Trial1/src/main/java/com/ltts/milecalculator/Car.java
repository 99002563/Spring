package com.ltts.milecalculator;

import org.springframework.stereotype.Component;

@Component
public class Car implements MileCalculator{

	@Override
	public void showMileage() {
		System.out.println("The mileage of car is 65");
		// TODO Auto-generated method stub
		
	}
	
	

}

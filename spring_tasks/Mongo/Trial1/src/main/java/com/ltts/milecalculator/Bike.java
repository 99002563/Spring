package com.ltts.milecalculator;

import org.springframework.stereotype.Component;

@Component
public class Bike implements MileCalculator {

	@Override
	public void showMileage() {
		// TODO Auto-generated method stub
		System.out.println("The mileage of bike is 70");
		
	}

}

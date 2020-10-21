package com.ltts.autowiring;

import org.springframework.stereotype.Component;

@Component("shape")
public class Rectangle implements Shape {

	@Override
	public void calculateArea(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("rectangle area is "+x*y);
	}
}

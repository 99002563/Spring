package com.ltts.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape {

	

	@Override
	public void calculateArea(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("triangle area is "+(x*y)/2);
	}

}

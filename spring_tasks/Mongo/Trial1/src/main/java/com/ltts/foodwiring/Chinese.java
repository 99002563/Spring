package com.ltts.foodwiring;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Chinese implements Menu {



	@Override
	
		// TODO Auto-generated method stub
		public List<String> itemsAvailable() {
			// TODO Auto-generated method stub
			
			return Arrays.asList("Shawarma","Cookies","Noodles");
		}
	
	}



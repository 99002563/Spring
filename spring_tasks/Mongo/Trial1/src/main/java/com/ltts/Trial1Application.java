package com.ltts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ltts.autowiring.ShapeFactory;
import com.ltts.constr.Student;
import com.ltts.foodwiring.FoodPanda;
import com.ltts.milecalculator.VehicleDetails;
import com.ltts.training.Employee;

@SpringBootApplication
public class Trial1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Trial1Application.class, args);
	}

	@Autowired
	ApplicationContext context;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee employee = context.getBean("employee", Employee.class);
		System.out.println(employee);
		Student stu = context.getBean("student", Student.class);
		System.out.println(stu);
		ShapeFactory shapeFactory = context.getBean(ShapeFactory.class);
		shapeFactory.printArea(10, 20);
		FoodPanda foodPanda = context.getBean(FoodPanda.class);
		List<String> fd = foodPanda.showMenu("chinese");
		for (String stri : fd) {
			System.out.println(stri);
		}
		VehicleDetails vehicleDetails = context.getBean(VehicleDetails.class);
		vehicleDetails.getMileage("bike");
	}

}

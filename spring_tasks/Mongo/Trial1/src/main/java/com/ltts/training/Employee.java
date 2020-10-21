package com.ltts.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

 
@Component
public class Employee {
    
    String empName;
    String empId;
    String dept;
    @Autowired
    Address address;
    
    
    public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getEmpName() {
        return empName;
    }
    @Value("${employee.empName}")
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getEmpId() {
        return empId;
    }
    @Value("${employee.empId}")
    public void setEmpId(String empId) {
        this.empId = empId;
    }
    public String getDept() {
        return dept;
    }
    @Value("${employee.dept}")
    public void setDept(String dept) {
        this.dept = dept;
    }
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", dept=" + dept + ", address=" + address + "]";
	}
    
    
    

 

}
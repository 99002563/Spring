package com.ltts.training;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    String City;
    String State;
    public String getCity() {
        return City;
    }
    @Value("${employee.address.City}")
    public void setCity(String city) {
        City = city;
    }
    public String getState() {
        return State;
    }
    @Value("${employee.address.State}")
    public void setState(String state) {
        State = state;
    }
    @Override
    public String toString() {
        return "Address [City=" + City + ", State=" + State + "]";
    }
    

 

}
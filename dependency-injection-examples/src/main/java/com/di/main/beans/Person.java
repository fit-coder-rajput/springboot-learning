package com.di.main.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="person bean")
public class Person {
	
	String name="Person";
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private final Vehicle vehicle;
	
	public Vehicle getVehicle() {
		return vehicle;
	}

	@Autowired
	Person(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

}
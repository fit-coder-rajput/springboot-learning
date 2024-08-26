package com.aop.main.services;

import org.springframework.stereotype.Component;

@Component
public class Animal {
	
	public String getVoice(boolean isAnimal) {
		
		return "systmmmmm";
	}
	
public String getName(boolean isAnimal) {
		throw new NullPointerException("no animal found");
		
	}
}

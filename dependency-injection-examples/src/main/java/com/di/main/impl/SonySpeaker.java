package com.di.main.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.di.main.services.Speaker;

@Component
@Primary
public class SonySpeaker implements Speaker {

	public void makeSound() {
		System.out.println("sony sound is awsome ... . .dhichicdhid ...sdhichik");
		
	}

}

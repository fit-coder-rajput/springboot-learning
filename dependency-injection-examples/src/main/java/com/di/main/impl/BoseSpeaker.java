package com.di.main.impl;

import org.springframework.stereotype.Component;

import com.di.main.services.Speaker;

@Component
public class BoseSpeaker  implements Speaker{

	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Bose sound is creazzyyy ... . .dhichicdhid ...sdhichik");

	}

}

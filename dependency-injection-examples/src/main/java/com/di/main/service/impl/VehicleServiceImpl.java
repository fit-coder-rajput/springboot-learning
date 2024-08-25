package com.di.main.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.di.main.services.Speaker;
import com.di.main.services.Tyre;
import com.di.main.services.VehicleServices;

@Component
public class VehicleServiceImpl implements VehicleServices {
	@Autowired
	Tyre tyre;
	
	Speaker speaker;
	
	

	public Speaker getSpeaker() {
		return speaker;
	}
	
	@Autowired
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	@Override
	public void playMusic() {
		speaker.makeSound();
		
	}

	@Override
	public void rotateTyre() {
		tyre.rotate();
		
	}

}

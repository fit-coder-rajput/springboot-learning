package com.di.main.impl;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.di.main.services.Tyre;

@Component
@Primary
public class BridgeStoneTyres implements Tyre{

	public void rotate() {
		// TODO Auto-generated method stub
		System.out.println("bridgestone tyre is cool ......");
	}

}
package com.di.main.impl;

import org.springframework.stereotype.Component;

import com.di.main.services.Tyre;

@Component
public class MichelinTyres  implements Tyre{

	public void rotate() {
		System.out.println("Michelin tyre is rough and tough ......");
		
	}

}

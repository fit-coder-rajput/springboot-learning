package com.di.main.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.di.main.services.VehicleServices;

@Component(value="vehicle bean")
public class Vehicle {
	
		VehicleServices vService;
		
		public VehicleServices getvService() {
			return vService;
		}

		public void setvService(VehicleServices vService) {
			this.vService = vService;
		}

		@Autowired
		Vehicle(VehicleServices vService){
			this.vService = vService;
		}

	

}

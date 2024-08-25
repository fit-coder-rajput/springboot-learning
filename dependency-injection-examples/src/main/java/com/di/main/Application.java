package com.di.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.di.main.beans.Person;
import com.di.main.beans.Vehicle;
import com.di.main.config.AppConfig;

public class Application {

	public static void main(String[] args) {
			
			var context = new AnnotationConfigApplicationContext(AppConfig.class);
			
			for(String str: context.getBeanNamesForType(Person.class)){
				System.out.println(str);
			}
			for(String str: context.getBeanNamesForType(Vehicle.class)){
				System.out.println(str);
			}
			Person person = context.getBean(Person.class);
			Vehicle vehicle = context.getBean(Vehicle.class);
			
			vehicle.getvService().playMusic();
			vehicle.getvService().rotateTyre();
			
			person.getVehicle().getvService().playMusic();
			context.close();

	}

}

package com.aop.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aop.main.config.ProjectConfig;
import com.aop.main.services.Animal;

public class AspectProgramming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);
			
			var animal = ctx.getBean(Animal.class);
			System.out.println(animal.getVoice(true));
			System.out.println(animal.getName(true));
//			ctx.close();
	}

}

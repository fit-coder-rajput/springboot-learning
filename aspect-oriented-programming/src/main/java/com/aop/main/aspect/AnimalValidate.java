package com.aop.main.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)  // first check if animal method is  valid basically ordering aspect based on requirements
public class AnimalValidate {

    private Logger logger = Logger.getLogger(AnimalValidate.class.getName());

    @Before("execution(* com.aop.main.services.*.*(..)) && args(isAnimal,..)")
    public void checkVehicleStarted(JoinPoint joinPoint, boolean isAnimal) throws Throwable {
        if(!isAnimal){
            throw new RuntimeException("Not an Animal");
        }
    }
}
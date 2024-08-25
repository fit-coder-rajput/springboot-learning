package com.di.main.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.di.main.beans","com.di.main.impl"})
@ComponentScan(basePackageClasses = {com.di.main.service.impl.VehicleServiceImpl.class})
public class AppConfig {

}

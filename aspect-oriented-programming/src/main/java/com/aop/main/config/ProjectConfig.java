package com.aop.main.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.aop.main.services","com.aop.main.aspect"})
public class ProjectConfig {

}

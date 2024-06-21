package com.example.config;

import com.example.bean.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
// Showing 2 ways of scanning components. We can use 1 way for all but it's just to demonstrate the other option
@ComponentScan(basePackages = {"com.example.bean","com.example.impl","com.example.services"}) // Package based
@ComponentScan(basePackageClasses = {com.example.bean.Vehicle.class, com.example.bean.Person.class}) // Class based
public class ProjectConfig {


}

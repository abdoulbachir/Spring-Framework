package com.example.config;

import com.example.bean.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.example.bean")
public class ProjectConfig {

    @Bean(value = "audi")
    Vehicle vehicle1(){
        var vehicle = new Vehicle();
        vehicle.setName("Audi 8");
        return vehicle;
    }

    @Bean(name="mercedes")
    Vehicle vehicle2(){
        var vehicle = new Vehicle();
        vehicle.setName("Mercedes Benz");
        return vehicle;
    }

    @Bean("toyota")
    Vehicle vehicle3(){
        var vehicle = new Vehicle();
        vehicle.setName("Toyota");
        return vehicle;
    }

    @Primary
    @Bean
    Vehicle vehicle4(){
        var vehicle = new Vehicle();
        vehicle.setName("Ferrari");
        return vehicle;
    }

//    @Bean
//    String hello(){
//        return "Hello World";
//    }
//
//    @Bean
//    Integer number(){
//        return 16;
//    }



}

package com.example.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private String make;
    private String model;

//    public Car(String make, String model) {
//        this.make = make;
//        this.model = model;
//    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @PostConstruct
    public void initialize(){
        this.setMake("Lexus");
    }

    public void printHello(){
        System.out.println("Hello from the car");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Car destroyed");
    }

}

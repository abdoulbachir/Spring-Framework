package com.example.bean;

import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name;
    private final Vehicle vehicle;

    public Person(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hi! My name is " + name + " and I'm driving a " + vehicle.getName();
    }
}

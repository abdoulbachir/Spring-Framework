package com.example.bean;

import com.example.services.VehicleService;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name;
    private final VehicleService vehicleService;

    public Vehicle(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleService getVehicleService() {
        return vehicleService;
    }
}

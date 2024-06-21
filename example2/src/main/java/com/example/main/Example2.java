package com.example.main;

import com.example.bean.Person;
import com.example.bean.Vehicle;
import com.example.config.ProjectConfig;
import com.example.impl.BoseSpeaker;
import com.example.impl.BridgeStoneTyres;
import com.example.services.VehicleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Example2 {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);


        Person person = context.getBean(Person.class);
        person.setName("Bachir");
        Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.setName("Toyota");

        System.out.println(person);
        vehicle.getVehicleService().moveVehicle();
        vehicle.getVehicleService().playMusic();

        VehicleService vehicleService = (VehicleService) context.getBean("vehicleService");
        vehicleService.setSpeaker(new BoseSpeaker());
        vehicleService.setTyres(new BridgeStoneTyres());

        person.setName("Boube");
        vehicle.setName("Mercedes");
        System.out.println("\n\n"+person);

        vehicle.getVehicleService().moveVehicle();
        vehicle.getVehicleService().playMusic();

    }
}

package com.example.main;

import com.example.config.ProjectConfig;
import com.example.model.Song;
import com.example.services.VehicleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Example3 {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleService vehicleService = context.getBean(VehicleService.class);
        System.out.println(vehicleService.getClass());

        Song song = new Song();
        song.setTitle("Blank Space");
        song.setSingerName("Taylor Swift");

        boolean vehicleStarted = true;

        String playMusicStatus = vehicleService.playMusic(vehicleStarted, song);
        vehicleService.moveVehicle(vehicleStarted);
        vehicleService.cleanVehicle(vehicleStarted);

    }
}

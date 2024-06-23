package com.example.services;

import com.example.interfaces.LogAspect;
import com.example.interfaces.Speaker;
import com.example.model.Song;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class VehicleService {

    private Logger logger = Logger.getLogger(VehicleService.class.getName());

    private Speaker speaker;

    public VehicleService(Speaker speaker) {
        this.speaker = speaker;
    }


    public String playMusic(boolean vehicleStarted, Song song) {
//        String music = null;
//        if(vehicleStarted){
//            music = speaker.makeSound(song);
//        }else{
//            logger.log(Level.SEVERE,"Vehicle not started to perform the" +
//                    " operation");
//        }
        return speaker.makeSound(song);
    }

    public String moveVehicle(boolean vehicleStarted) {
//        throw new NullPointerException("Not implemented yet");
        return "I'm moving";
    }

    @LogAspect
    public String cleanVehicle(boolean vehicleStarted) {
        return "I don't want to clean the vehicle.";
    }
}

package com.example.services;

import com.example.interfaces.Speaker;
import com.example.interfaces.Tyres;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    private Speaker speaker;
    private Tyres tyres;

    public VehicleService(Speaker speaker, Tyres tyres) {
        this.speaker = speaker;
        this.tyres = tyres;
    }

    public void moveVehicle(){
        tyres.rotate();
    }

    public void playMusic(){
        speaker.makeSound();
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}

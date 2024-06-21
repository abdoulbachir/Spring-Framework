package com.example.impl;

import com.example.interfaces.Speaker;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeaker implements Speaker {
    @Override
    public void makeSound() {
        System.out.println("Making sound from Bose Speakers");
    }
}

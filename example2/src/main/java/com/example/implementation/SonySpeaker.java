package com.example.implementation;

import com.example.interfaces.Speaker;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeaker implements Speaker {
    @Override
    public void makeSound() {
        System.out.println("Making sound from Sony Speakers");
    }
}

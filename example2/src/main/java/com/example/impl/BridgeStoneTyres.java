package com.example.impl;

import com.example.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {
    @Override
    public void rotate() {
        System.out.println("BridgeStone Tyres are rotating.");
    }
}

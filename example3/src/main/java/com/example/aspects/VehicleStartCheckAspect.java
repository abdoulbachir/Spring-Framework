package com.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
@Order(1)
public class VehicleStartCheckAspect {

    private final Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    // Used args to further restricts the join points to methods that take a specific set of arguments.
    @Before("execution(* com.example.services.*.*(..)) && args(vehicleStarted, ..)")
    public void logVehicleStarted(JoinPoint joinPoint, boolean vehicleStarted) {
        if (!vehicleStarted){
            throw new RuntimeException("Vehicle not started");
        }
    }

}

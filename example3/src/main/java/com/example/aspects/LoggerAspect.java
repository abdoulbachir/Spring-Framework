package com.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
@Component
@Order(2)
public class LoggerAspect {

    private final Logger logger = Logger.getLogger(LoggerAspect.class.getName());

//    @Around("execution(* com.example.services.*.*(..))") //For logic Before and After method
//    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
//
//        // Before logic
//        logger.info(joinPoint.getSignature().toString() + " method execution started");
//        Instant start = Instant.now();
//
//        Object returnedValue = joinPoint.proceed(); // Execute actual method and get the return value
//
//        //After logic
//        Instant end = Instant.now();
//        long timeElapsed = Duration.between(start, end).toMillis();
//        logger.info("Time took to execute the method: " + timeElapsed);
//        logger.info(joinPoint.getSignature().toString() + " method execution finished");
//
//        return returnedValue; // Return our returned value
//    }
//
//    @AfterThrowing(value = "execution(* com.example.services.*.*(..))", throwing = "ex")
//    public void logException(JoinPoint joinPoint, Exception ex) throws Throwable {
//        logger.log(Level.SEVERE, joinPoint.getSignature() + " An exception thrown with the help of"+
//                " @AfterThrowing which happened due to: "+ex.getMessage());
//    }
//
//    @AfterReturning(value = "execution(* com.example.services.*.*(..))", returning = "retVal")
//    public void logStatus(JoinPoint joinPoint, Object retVal) {
//        logger.log(Level.INFO, joinPoint.getSignature() + " Method successfully processed with the status: "
//                 + retVal.toString());
//    }


    @Around("@annotation(com.example.interfaces.LogAspect)")
    public Object logWithAnnotation(ProceedingJoinPoint joinPoint) throws Throwable {

        logger.info(joinPoint.getSignature().toString() + " method execution started");
        Instant start = Instant.now();
        Object returnedValue = joinPoint.proceed();
        Instant end = Instant.now();
        long timeElapsed = Duration.between(start, end).toMillis();
        logger.info("Time took to execute the method: " + timeElapsed);
        logger.info(joinPoint.getSignature().toString() + " method execution finished");

        return returnedValue;
    }

}

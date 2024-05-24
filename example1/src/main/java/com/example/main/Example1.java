package com.example.main;

import com.example.bean.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda Civic");
        System.out.println("Vehicle name from non-spring context is: " + vehicle.getName());


        /* Initialize Spring IoC container as Spring Context.
           Here we're telling the framework to consider all the config in ProjectConfig class*/
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Getting the Spring Bean of type Vehicle and assign it to vehicle1
        Vehicle vehicle1 = context.getBean("vehicle4", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + vehicle1.getName());

        Vehicle vehicle2 = context.getBean("audi", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + vehicle2.getName());

        Vehicle vehicle3 = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + vehicle3.getName());


        /*
         * No need to do any explicit casting while fetching a bean from context.
         * Spring is smart enough to look for a bean of the type we requested in its context.
         * If such bean doesn't exist, Spring will throw an exception.
         */
        String hello = context.getBean(String.class);
        System.out.println("String value from Spring Context is: " + hello);
        Integer num = context.getBean(Integer.class);
        System.out.println("Integer value from Spring Context is: " + num);


    }
}

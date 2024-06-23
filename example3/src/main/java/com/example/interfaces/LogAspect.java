package com.example.interfaces;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // Specifies that the annotation will be available at runtime
@Target(ElementType.METHOD) // Specifies that the annotation can be applied to methods
public @interface LogAspect {
}

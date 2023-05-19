/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s11.ex;

import java.util.logging.Logger;

public class MotorBike extends Vehicle {
/**
 * TODO: MotorBike is-a Vehicle
 */

    private static final Logger log = Logger.getGlobal();

    /**
     * No-arg constructor
     */
    public MotorBike() {
        log.info("MotorBike created");
    }
}

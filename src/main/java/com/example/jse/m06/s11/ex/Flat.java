/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s11.ex;

import java.util.logging.Logger;

public class Flat implements Conditioning {


    private static final Logger log = Logger.getGlobal();

    /**
     * No-arg constructor
     */
    public Flat() {
        log.info("Flat created");
    }
    @Override 
    public void  setTemperature(int t) {
    	log.info("Temperature: " + t);
    }
}

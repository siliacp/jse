/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s02;

import java.util.logging.Logger;

/**
 * A sample class - Encapsulation violation
 */
public class Dog {
    

	private static final Logger log = Logger.getGlobal();
    private static final String NO_NAME = "Unknown";

    /** !!! weak data hiding - don't do that, if you don't really have to */
    String name;

    /**
     * No-arg constructor. Default initialization of
     */
    public Dog() {
        log.info("Creating a new dog");
        this.name = NO_NAME;
    }

    /**
     * Canonical constructor
     * 
     * @param name the dog name
     */
    public Dog(String name) {
        log.info("Creating a new dog " + name);
        this.name = name;
    }

    /**
     * Safe setter. The name is checked before accepting it.
     * 
     * @param name the new dog name
     */
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            log.warning(String.format("User tried to set name to [%s]", name));
            return;
        }
        for (int i = 0; i < name.length(); i++) {
            if (!Character.isLetter(name.charAt(i))) {
                log.warning(String.format("User tried to set name to [%s]", name));
                return;
            }
        }

        log.info(String.format("Dog nome set to [%s]", name));
        this.name = name;
    }

    /**
     * Getter.
     * 
     * @return the dog name
     */
    public String getName() {
        return name;
    }
}

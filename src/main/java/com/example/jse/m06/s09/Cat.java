/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s09;

/**
 * A cat "is-a" mammal and "has-a" tail
 */
public class Cat extends Mammal {
    private Tail tail;

    /**
     * Constructor
     * 
     * @param gestationDays days to get a new cat
     * @param tailLen       the tail length
     */
    public Cat(int gestationDays, int tailLen) {
        // call the super constructor
        super(gestationDays);
        // create the cat tail
        this.tail = new Tail(tailLen);
    }

    @Override
    public String toString() {
        return "Cat [tail=" + tail + ", gestation=" + gestation + "]";
    }
}

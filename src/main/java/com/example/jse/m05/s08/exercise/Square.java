/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m05.s08.exercise;

/**
 * Complete the code
 * 
 * @see Main the user class
 */
public class Square {
    // TODO: every square should have its own side length
	private double side;
	
    /**
     * Constructor
     * 
     * @param side the square side
     */
    public Square(double side) {
        // TODO: initialize the current side length
    this.side = side;
    }

    /**
     * The square area is side ^ 2
     * 
     * @return the square area
     */
    public double area() {
       return side * side;
    	// throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * The square perimeter is 4 * side
     * 
     * @return the square perimeter
     */
    public double perimeter() {
    //    throw new UnsupportedOperationException("Not yet implemented");
    	return 4 * side;
    }
}

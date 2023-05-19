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
public class Circle {
	private double radius;
	// TODO: every circle should have its own radius

	/**
	 * Constructor
	 * 
	 * @param radius the circle radius
	 */
	public Circle(double radius) {
		this.radius = radius;
		// TODO: initialize the current circle radius
	}

	/**
	 * The circle area is π * radius ^ 2
	 * 
	 * @return the circle area
	 */
	public double area() {
		return Math.pow(radius, 2) * Math.PI;

//        throw new UnsupportedOperationException("Not yet implemented");
	}

	/**
	 * The circle area is 2 * π * radius
	 * 
	 * @return the circle perimeter
	 */
	public double perimeter() {
		return 2 * Math.PI * radius;
		// throw new UnsupportedOperationException("Not yet implemented");
	}
}

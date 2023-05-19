/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s07.ex;

/**
 * Override exercise
 * 
 * Any class derives from Object, implicitly or explicitly
 */
public class Dog {
    // TODO: override toString()
	private String name;
	private int age;
	
	public Dog (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString () {
		return "Sono " + name + " e la mia età è di " + age + " secoli.";
	}
	
	
}

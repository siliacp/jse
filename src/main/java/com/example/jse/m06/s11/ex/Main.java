/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s11.ex;

import java.util.Arrays;

/**
 * Interface vs class exercise
 */
public class Main {
	/**
	 * See requests in the "to do" comments
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		// TODO: (1) put objects of (at least) three different types in this array
		Vehicle[] vehicles = {new Car(), new MotorBike(), new Bus()};
		System.out.println(Arrays.toString(vehicles));

		// TODO: (2) let all vehicle steer in alternate directions
//		Car car = new Car();
//		Bus bus = new Bus();
//		MotorBike motorbike = new MotorBike();

		
		for (int i = 0; i < vehicles.length; i++) {
			vehicles[i].steer(true);
		}
		
//		car.steer(true);
//		bus.steer(true);
//		motorbike.steer(true);
		
		
		

		// TODO: (3) put objects of (at least) three different types in this array
		Conditioning[] conditionings = {};
		System.out.println(Arrays.toString(conditionings));

		// TODO: (4) set the temperature of each conditioned to 20
	}
}

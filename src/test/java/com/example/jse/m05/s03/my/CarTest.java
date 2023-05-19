package com.example.jse.m05.s03.my;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

	@Test
	void steerLeft() {
		Car car = new Car("", ""); // questi doppi doppi apici indicano che è una macchina che non ha nè modello nè
									// marca, dato che al momento non ci interessa che li abbia
		boolean input = true;
		String expected = "Ho sterzato a...sinistra";
		String actual = car.steer(input);
		assertEquals(expected, actual);
	}

}

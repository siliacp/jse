/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s11.ex;

/**
 * Control flow - Loop: while / do-while
 */
public class Exercise5 {
	/**
	 * Emulate multiplicative operators with the help of while or do-while loops.
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		int a = 10;
		int b = 3;

		int multi = a * b;
		System.out.println("a * b = " + multi);
		int prodotto = 0;
		int i = 0;
		while (i < b) {
			prodotto = prodotto += a;
			i++;
		}
		System.out.println("a * b = " + prodotto);

		// 2
		int div = a / b;
		System.out.println("a / b = " + div);
		// TODO (2) Get the same result without dividing
		int temp = a;
		i = 0;

		while (temp >= b) {
			temp -= b;
			i++;
		}
		System.out.println("a/b = " + i);

		// 3
		int mod = a % b;
		System.out.println("a % b = " + mod);
		// TODO (3) Get the same result without using the modulo operator
		temp = a;
		while (temp >= b) {
			temp -= b;
		}
		System.out.println("a % b = " + temp);
	}
}

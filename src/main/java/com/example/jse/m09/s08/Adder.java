/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m09.s08;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * File input by Scanner
 */
public class Adder {
	private static final Logger log = Logger.getGlobal();

	/**
	 * Scanner
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		System.out.println("Please, enter a few numbers");
		double result = 0.0;

		Scanner scanner = new Scanner(System.in); //in rappresenta la tastiera
		while (scanner.hasNext()) {	//con questo mi accerto che ci sia un dato 
			if (scanner.hasNextDouble()) { // questo si chiede se la stringa che mi è arrivata dall'utente può essere o meno un
											// double, e lo converte in un double
				result += scanner.nextDouble(); //al risultato si aggiunge e si assegna ciò che ritorna a hasNextDouble, cioè aggiungo quello che mi ha messo l'utente
				log.info("Current result is " + result);
			} else {
				System.out.println("Bad input, discarded: " + scanner.next());
			}
		}
		scanner.close();
		System.out.println("Total is " + result);
	}
}

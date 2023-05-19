package com.example.jse.m06.s02.esGetterSetter;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// tra parentesi mettiamo la frequenza che vogliamo in cui i cani abbiao, e lo
		// devo mettere pure in Dog
		Dog[] dogs = { new Dog(10), new Pitbull(91), new Husky(12) };
		System.out.println(Arrays.toString(dogs));
		for (int i = 0; i < dogs.length; i++) {
			dogs[i].bark();

		}
		f(dogs[0]);
	}

	// questo qua sotto è un metodo
	// qua sotto con l'IF gli sto dicendo di guardare solo i cani che stabilisco
	// sopra con f
	public static void f(Dog dog) {
		if (dog.getFrequency() <= 90) {
			System.out.println("Il cane non può abbaiare xk la f è troppo bassa");
		} else dog.bark ();
	}
}

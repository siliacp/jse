package com.example.jse.m05.s03.my;

public class Car {
	private String brand;
	private String model;

	public Car(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}

	@Override
	// questo Override vuol dire che un metodo definito in una classe madre lo sto
	// ridefinendo qui, perchè cambia un pochino rispetto a quello originale. E lo
	// stesso metodo definito in due classi diverse. Quindi sto ridefinendo un
	// metodo. Per esempio anche il toString è un override, che viene ridefinito per
	// fare stampare in modo più simpatico. Poi c'è anche l'overload
	// questo toString mi serve per creare una stringa più leggibile quando stampo
	// (il risultato è "Car [brand=Fiat, model=Panda]")
	public String toString() {
		return "Car [brand= " + brand + ", model= " + model + "]";
	}
// left perché abbiamo deciso che se passo TRUE allora giro a sx; mentre se passo FALSE allora sterzo a dx
	public String steer (boolean left) {
		return "Ho sterzato a..." + (left ? "sinistra" : "destra");

// esempio con IF:
//		public String steer (boolean left) {
//		String direzione;
//		if(left) {
//			direzione = "sx";
//			
//		} else {
//			direzione = "dx";	
//		}
//		return "Ho sterzato etc" + direzione;  
//
}
}

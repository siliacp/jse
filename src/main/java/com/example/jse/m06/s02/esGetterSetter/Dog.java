package com.example.jse.m06.s02.esGetterSetter;

public class Dog {
	private int frequency;

	// questo sotto è il costruttore è l'ho generato facendo GENERA
	public Dog(int frequency) {
		super();
		this.frequency = frequency;
	}
//questo è il getter e l'ho creato tramite il generate
	public int getFrequency() {
		return frequency;
	}

	public void bark() {
		System.out.println("Sono un cane " + frequency);

	}

	@Override
	public String toString() {
		return "Dog [frequency=" + frequency + "]";
	}

}

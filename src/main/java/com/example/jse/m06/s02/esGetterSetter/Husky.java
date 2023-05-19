package com.example.jse.m06.s02.esGetterSetter;

public class Husky extends Dog{
	public Husky(int frequency) {
		super(frequency);
	}

	@Override
	public void bark() {
System.out.println("Sono un husky " + getFrequency());
	}

}

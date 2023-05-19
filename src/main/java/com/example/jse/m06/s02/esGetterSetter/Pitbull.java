package com.example.jse.m06.s02.esGetterSetter;

public class Pitbull extends Dog {
	public Pitbull(int frequency) {
		super(frequency);
	}

	@Override
	public void bark() {
		System.out.println("Sono un pitbull " + getFrequency());
	}
}

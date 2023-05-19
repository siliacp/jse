package com.example.jse.m07esercizi;

@SuppressWarnings("serial")
public class MaxException extends Exception { // se estendo Exception allora l'eccezione checked;

	public MaxException() {
		super();

	}
//
//	public MaxException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
//		super(message, cause, enableSuppression, writableStackTrace);
//	}
//
//	public MaxException(String message, Throwable cause) {
//		super(message, cause);
//
//	}

	public MaxException(String message) { // queso è il costruttore (superclasse) che mi serve, perché voglio usare una
											// stringa quando spunta l'eccezione (come si vede nella classe
											// ExcerciseException) cioè il messaggio che voglio fare vedere, che in
											// questo caso è "Numbers should be a non empty array". è la cosa più usata.
		super(message);

	}

//	public MaxException(Throwable cause) {
//		super(cause);
//
//	}
//
}

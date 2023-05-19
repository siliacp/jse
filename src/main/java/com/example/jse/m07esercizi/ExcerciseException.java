package com.example.jse.m07esercizi;

public class ExcerciseException {
	public static int max(int[] numbers) throws MaxException { // metto il throws perché ho usato una exception checked,
																// è una documentazione, vuol dire che avviso che ogni
																// tanto il metodo può lanciare un'eccezione, è una
																// specie di avviso. Scrivo MAXException perché è sul
																// metodo MAX che ho un eccezione, quindi accompagno con
																// il nome del metodo problematico cui mi riferisco.
																// Altrimenti se fosse una unchecked non metto niente.
		if (numbers == null || numbers.length == 0) {
			throw new MaxException("Numbers should be a non empty array"); // io lancio l'eccezione nel caso in cui si
																			// avverino queste due eccezioni. Questo è
																			// un ordine, ordino a Java di
																			// lanciare un'eccezione

		}
		int temp = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > temp) {
				temp = numbers[i];
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		try {
			int[] numeri = {1,2,3,5,5,5,9,0,0,0};
			int x = ExcerciseException.max(numeri);
			System.out.println(x);
		} catch (Exception e) { // se c'è un problema gestisco l'eccezione
			System.out.println(e);
		}
	}
}

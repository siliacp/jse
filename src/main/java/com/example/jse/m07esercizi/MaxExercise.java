package com.example.jse.m07esercizi;

//questo non c'entra niente con gli altri esercizi di questo pacchetto. è un esercizio per trovare il massimo
public class MaxExercise {

	public static int max(int[] input) {
		if (input == null || input.length == 0) {
			throw new IllegalArgumentException("Bla bla");
		}
		int result = input[0]; // metto in result il primo elemento dell'array
		for (int i = 1; i < input.length; i++) { // eseguo tutti gli elementi dell'array
			if (input[i] > result) { // input[i] è il valore corrente
				result = input[i];
			}
		}
		return result;
	}

//	public static void main(String[] args) { //guarda JUnit per il test serio
//		try {
//			int x = max(new int[] {3,2,7}); //qui ho creato il mio array di interi
//			System.out.println(x);
//		} catch (Exception e) { // qui io sto dando un nome all'eccezione
//			System.out.println(e);
//		}
//
//	}

}

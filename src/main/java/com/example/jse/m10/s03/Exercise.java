/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m10.s03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Three exercises. Compare int[] and List&lt;Integer&gt; behavior
 */
public class Exercise {
	public static void main(String[] args) {
		Exercise exercise = new Exercise();
		int[] array = { 2, 5, 8, 3, 7, 4 };
		int[] result = exercise.evensRaw(array);
		System.out.println(Arrays.toString(result));

		List<Integer> list = List.of(2, 5, 8, 3, 7, 4); //list.of è uno static factory method e crea una lista non modificabile
		List<Integer> x = exercise.evens(list); //passo la lista al metodo evens, che ritornerà una lista con solo i valori pari
		System.out.println(x); //x è il reference alla lista ritornata da evens
	}

	/**
	 * Extract from input the even values and return them in an array
	 * <p>
	 * Examples:
	 * <li>in {9, 2, 3, 4} -> out {2, 4}
	 * <li>in {6, 2, 4, 2} -> out {2, 2, 4, 6}
	 * <li>in {2, 3, 4, 6} -> out {2, 4, 6}
	 * 
	 * Do not use Collections in here!
	 * 
	 * @param data a bunch of integers
	 * @return even values from input
	 */
	public int[] evensRaw(int[] data) {
		int[] result = new int[data.length];
		int len =0;
		for (int i = 0; i < data.length; i++) { // facendo j=0 io ho inserito un'altra variabile di loop, e posso
														// farlo solo se è dello stesso tipo (in questo caso INT) della
														// prima variabile, e attenzione devi mettere la virgola e non
														// il punto e virgola
			if (data[i] % 2 == 0) {
				result[len] = data[i]; //ogni volta che troviamo un valore pari lo mettiamo in result nella posizione corrente
				len++;
			}
		}
		int[] actual = Arrays.copyOf(result, len); //sto dicendo di creare un array copia di result, ma con la lunghezza di len
		return actual;
	}

	/**
	 * Extract from input the even values and return them
	 * <p>
	 * Example: in {2, 3, 4, 5} -> out {2, 4}
	 * 
	 * @param data a bunch of integers
	 * @return even values from input
	 * 
	 */
	public List<Integer> evens(List<Integer> data) {
		List<Integer> result = new ArrayList<> ();
	
//		for (int i = 0; i < data.size (); i++) {
//			Integer cur = data.get(i); //.get è come usare le [] ma per le liste, quindi indica l'indice
//			if (cur %2 == 0) {
//				result.add(cur);
//			}
//		}
		for (Integer cur : data) {
			if (cur %2 == 0) {
				result.add(cur);
			}
		}
		
		return result;
	}

	/**
	 * Extract non-duplicated values in input and return them in a list.
	 * <p>
	 * Example: in {5, 4, 2, 3, 7, 4, 5, 6} -> out {2, 3, 6, 7}
	 * 
	 * @param data a bunch of integers
	 * @return only the non-duplicated values from input
	 */
	public List<Integer> singles(List<Integer> data) {
	//	throw new UnsupportedOperationException("Not yet implemented");
	List <Integer> result = new ArrayList<>();
	for (Integer cur : data) {
		if (count(data, cur) == 1) {
			
		}
	} return result;
	

	}
	private int count(List<Integer> data, Integer target) {
		int count = 0;
		for (Integer cur : data) {
			if (cur.equals(target)) {
				count ++;
			}
		}return count;
	} 
}

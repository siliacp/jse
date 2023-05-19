package com.example.jse.m10.s05.exercise;

import java.util.ArrayDeque;
// voglio che mi stampi la stringa scritta all'incontrario
public class Esercizio {
	public static void main(String[] args) {
		String s = "ciao";
		ArrayDeque<Character> buffer = new ArrayDeque <>();	//Deque vuol dire coda con doppia uscita/entrata, perchè posso inserire elementi nella coda sia dall'inizio che dalla fine 
		for (int i = 0; i < s.length(); i++) {		//in questo modo io sto inserendo i caratteri di "ciao" carattere per carattere dentro la coda
			buffer.push(s.charAt(i));				//push vuol dire inserire, inserisco i caratteri; pop vuol dire eliminare
		}
//		System.out.println(buffer);
//		while(buffer.size() > 0) {
//			System.out.println(buffer.pop(); //pop vuol dire eliminare
//		
//		}
		System.out.println(buffer);
		while(buffer.size() > 0) {
			buffer.pop();
			System.out.println(buffer);
	}
	}}

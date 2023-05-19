/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s11.ex;

import java.util.Arrays;

/**
 * Control flow - Loop: while / do-while
 */
public class Exercise1a {

    public static void main(String[] args) {
    	String [] words = {"alfa" , "beta", "gamma", "delta"};
    	System.out.println(words);
    	System.out.println(Arrays.toString(words));
   
    	int i = 0;
    	while (i < words.length) {
    		System.out.println(words[i]);
    		i = (i+1) %4;
    	}
    	System.out.println("Ho eseguito " + i + " loop");
    }
}

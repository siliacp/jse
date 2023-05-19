/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m10.s03;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList
 */
public class ArrayListExample {
    /**
     * A few methods from ArrayList
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        List<Integer> list0 = new ArrayList<>(); //dopo ArrayList negli <> posso mettere integer o non metterlo, il compilatore capisce da solo. Tra le tonde invece ci metto la capacity cioè le celle che voglio che l'array abbia
        recap("An empty list", list0);	 

        List<Integer> list1 = new ArrayList<Integer>(5);
        recap("An empty list w/ given (5) capacity", list1);

        // adding an element in the last position
        list1.add(56);
        // adding an element in the first position
        list1.add(0, 18);
        list1.add(42);
        recap("After adding elements", list1);

        ArrayList<Integer> list2 = new ArrayList<>(list1); //crea una array list compiando gli elementi della lista1, copia non la capacity ma solo gli elementi che ci sono all'interno dell'array list, e li copia proprio come oggetti quindi il reference è il medesimo e quindi l'id è lo stesso
        recap("A list by copy constructor", list2);

        Integer value = list2.get(0);
        System.out.println("Value at the beginning: " + value);

        // calculate the index of the last element
        int lastPos = list2.size() - 1; //ci chiediamo qual è la posizione dell'ultimo elemento nella lista2. La size è la dimensione della collection, e la size mi dice quanti elementi ci sono all'interno (è diversa dalla capacity). Anche in questo caso la posizione parte da 0, quindi l'indice della posizione dell'ultimo elemento è size-1, come per length
        // change its value
        list2.set(lastPos, 11); //qua sto dicendo di mettere nell'ultima cella il numero 11

        // removing the element in second position
        list2.remove(1);

        recap("After changing the last element and removing the middle one", list2);
    }

    /**
     * Utility method to print some information on a list
     */
    private static void recap(String message, List<?> lst) {
        System.out.printf("%s: %s, current size %d%n", message, lst, lst.size());
    }
}

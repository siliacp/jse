/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s15.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Exercise: create a hierarchy of classes based on Actor dentro le attrici devi
 * mettermi maghe e guerriere
 * <p>
 * Warrior: could fight, can't do any magic
 * <p>
 * Wizard: can't fight, could do magic
 */
public class Main {
	/**
	 * Create a bunch of actors
	 * <p>
	 * Let them fight against each others
	 * <p>
	 * Peer-to-peer fight, the most skilled one wins
	 * <p>
	 * Wizards always beat warriors
	 * <p>
	 * In the end, let the user knows who survived
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		// TODO: create actors, both warriors and wizards
		List<Actor> actors = new ArrayList<>(List.of(new Warrior("Fabrizia", 2), new Warrior("Silvia", 5),
				new Warrior("Chiara", 1001), new Witch("Silia", 3), new Witch("Emanuele", 1), new Witch("Tiziana", 8),
				new Witch("Elena", 5)));

//		Actor[] actors = { new Warrior("Fabrizia", 2), new Warrior("Silvia", 5), new Warrior("Chiara", 1001),
//				new Witch("Silia", 3), new Witch("Emanuele", 1), new Witch("Tiziana", 8), new Witch("Elena", 5) };

//		for (Actor actor : actors) {
//			System.out.println(actor);
//		}

		System.out.println("Let's fight ...");
		for (int i = 0; i < actors.size(); i++) {
			for (int j = 0; j < actors.size(); j++) {
				if (i != j) {
					if (actors.get(i).fight(actors.get(j))) { //actor i combatte contro actor j
						actors.remove(j);
					} else {
						actors.remove(i);
					}
				}

			}
			System.out.println("Actor: " + actors);
			// ...
		}
		for (int i = 0; i < actors.size(); i++) {
			if (actors.get(i).isAlive()) {
				System.out.println(actors.get(i).getName() + " is alive");
			}
		}

	}
}

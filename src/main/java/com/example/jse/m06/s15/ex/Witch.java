package com.example.jse.m06.s15.ex;

import java.util.logging.Logger;

public class Witch extends Actor {
	private static final Logger log = Logger.getGlobal();

	public Witch(String name, int experience) {
		super(name, experience);
	}

	// con Actor enemy indico contro chi voglio che la strega combatta,
//	public boolean fight(Actor enemy) {
//		if (!(enemy instanceof Witch)) {
//			log.info(getName() + " won"); // getName è il personaggio della classe corrente
//			return true; // perchè le witches vincono sempre contro le warrior
//		}
//		if (this.getExperience() > enemy.getExperience()) {
//			System.out.println(getName() + " maledici " + enemy);
//			return true;
//		}
//		return false;
//	}

//questo è la stessa cosa di fight ma scritto in modo diverso
	@Override
	public boolean fight(Actor enemy) {
		if (enemy instanceof Witch && enemy.getExperience() > this.getExperience()) {
			log.info(enemy.getName() + " won");
			this.setAlive(false);
			return false;
		}
		log.info(getName() + " won");
		enemy.setAlive(false);
		return true;
	}

	@Override // è fatto sul metodo toString
	public String toString() {
		return String.format("Witch (%b) %s", this.isAlive(), this.getName());

	}

}

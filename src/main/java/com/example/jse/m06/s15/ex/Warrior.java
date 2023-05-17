package com.example.jse.m06.s15.ex;

import java.util.logging.Logger;

public class Warrior extends Actor {
	private static final Logger log = Logger.getGlobal();
	public Warrior(String name, int experience) {
		super(name, experience);
	}

	public boolean fight(Actor enemy) {
		if (enemy instanceof Witch) {
			log.info(getName() + " lost");
			this.setAlive(false);
			return false;
		}
		if (this.getExperience() > enemy.getExperience()) {
			System.out.println(getName() + " scanna " + enemy);
			enemy.setAlive(false);
			return true;
		}
		this.setAlive(false);
		return false;
	}

	@Override
	public String toString() {
		return String.format("Warrior (%b) %s" , this.isAlive(), this.getName());
	}

}

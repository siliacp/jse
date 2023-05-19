package strangeAnimal;

import java.util.logging.Logger;

public class Ccnll {
	private static final Logger log = Logger.getGlobal();
	private String bruttezza;
	private String cattiveria;
	private String cuteness;
	private String pettiness;

	public Ccnll(String bruttezza, String cattiveria, String cuteness, String pettiness) {
		this.bruttezza = bruttezza;
		this.cattiveria = cattiveria;
		this.cuteness = cuteness;
		this.pettiness = pettiness;
	}

	public String toString() {
		log.info("Reminder: " + bruttezza);
		return "Your ugliness level is " + bruttezza + ", while your badass level is " + cattiveria + "."
				+ "  What are your main features? The first one is " + cuteness + " and the second one is " + pettiness;
	}
	public String toString(boolean flag) {
		return "Are you perfect? " + flag;
	}

	public String direction(boolean right) {
		return "Something -> you're starting from the " + (right ? "right" : "left");
	}

	// se passo TRUE allora la risposta è too much
	public String blabla(boolean too_much) {
		return "Your cuteness is " + (too_much ? "too much" : "too less");

	}
}

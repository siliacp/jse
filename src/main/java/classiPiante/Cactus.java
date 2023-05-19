package classiPiante;

public class Cactus extends Plant implements Eater {
	public Cactus(String name) {
		super(name);
	}

	@Override
	public void eat(Plant target) { // target si riferisce a chi deve essere attaccato
		System.out.println("I'm eating " + target);
	}
}

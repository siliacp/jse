package classiPiante;

public abstract class Plant implements Talking {
	private String name;

	public Plant(String name) {
		this.name = name;
	}

	@Override
	public String toString() { // toString per stampare un nome
		return "Plant [name= " + name + "]";
	}

	@Override
	public void talk(String phrase) { // metodo richiamato dall'interfaccia
		System.out.println(phrase + ": " + name);
	}
}

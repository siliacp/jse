package classiPiante;

public class MainPiante {
public static void main (String[] args) {
	Plant ada = new Rose("Ada");
	Cactus zoe = new Cactus ("Zoe");
	System.out.println(ada); 
	zoe.eat (ada);
	zoe.talk("ciao");
}
}

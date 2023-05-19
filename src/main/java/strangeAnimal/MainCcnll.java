package strangeAnimal;

public class MainCcnll {
	public static void main(String[] args) {
		if (args.length < 4) {
			System.out.println("Passare le 4 caratteristiche del Ccnll");
			return;
		} else {
			Ccnll ccnll = new Ccnll(args[0], args[1], args[2], args[3]);
			System.out.println(ccnll);
			String message = ccnll.direction(false);
			System.out.println(message);

			String message1 = ccnll.blabla(false);
			System.out.println(message1);
			System.out.println(ccnll.toString(false));

		}

	}
}

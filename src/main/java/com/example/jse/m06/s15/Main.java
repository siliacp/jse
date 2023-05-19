/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s15;

/**
 * Reference casting example
 */
public class Main {
	/**
	 * Working with objects in a hierarchy
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		// a cat is a pet is a brushable
		Brushable kim = new Cat("Kim"); // ho creato l'oggetto gatto è l'ho salvato nella variabile brushable; questa è
										// la variabile kim, ed è la variabile brushable
		kim.brush(); // invoco il metodo brush

		// let kim barks, but only if it is a dog
		if (kim instanceof Dog) { // questo vuol dire che sto chiedendo a Java se kim è un cane
			// downcast protected by instanceof
			Dog dog = (Dog) kim; // questo è un downcast un po' strano --> stiamo lavorando su kim che so che è
									// un gatto ma lo so solo perchè l'ho visto sopra, ma se guardo solo la
									// variabile brushable.kim non lo posso sapere, potrebbe essere anche un dog
									// (dato che è presente nella gerarchia)
			dog.bark();
		}

		// Crosscast forbidden, won't compile: Cannot cast from Dog to Cat
//       Cat cat = (Cat) new Dog(); -->non possiamo fare il casting perchè si può fare il casting solo se gli oggetti sono su una gerarchia; in questo caso cane e gatto sono fratelli quindi non si può fare nessun casting

		// Upcast always good (Liskov)
		Pet pet = new Dog("Bob"); //creiamo il cane bob e lo mettiamo in reference a PET (che è una classe astratta)

		// Right downcast (but risky, DO NOT DO THIS IN PRODUCTION CODE!)
		Dog dog = (Dog) pet;
		dog.bark();

		// WRONG downcast! leads to a ClassCastException at runtime
//        Cat cat = (Cat) pet;
		// next line is just not to have a warning for unused cat on the previous line
//        System.out.println(System.identityHashCode(cat));

		// Always protect your downcast with instanceof
		if (pet instanceof Cat) {
			Cat tom = (Cat) pet;
			tom.meow();
		} else {
			System.out.println("This pet is not a cat!");
		}

		// An array of pet could contain reference to any subclass
		Pet[] pets = { new Dog("Tom"), new Cat("Bob") };

		for (int i = 0; i < pets.length; i++) {
			pets[i].brush();
		}

		f(pets);
		g(pets);
	}

	/**
	 * Let each pet make its noise - using downcast
	 * 
	 * @param pets a few pets
	 */
	static void f(Pet[] pets) {
		if (pets == null) {
			return;
		}

		System.out.println("Let each pet bark or meow ...");
		for (int i=0; i < pets.length; i++) {
			if (pets[i] instanceof Dog) {
				Dog dog = (Dog) pets[i];
				dog.bark();
			} else if (pets[i] instanceof Cat) {
				Cat cat = (Cat) pets[i];
				cat.meow();
			}
		}
		//questo sotto è la stessa cosa di sopra ma scritto con il for classico anziché il for each
//		for (Pet pet : pets) {
//			if (pet instanceof Dog) {
//				Dog dog = (Dog) pet;
//				dog.bark();
//			} else if (pet instanceof Cat) {
//				((Cat) pet).meow();
//			}
//		}
	}

	/**
	 * Let each pet make its noise - using polymorphism
	 * 
	 * @param pets a few pets
	 */
	static void g(Pet[] pets) {
		if (pets == null) {
			return;
		}

		System.out.println("Let each pet make its noise  ...");
		for (Pet pet : pets) {
			pet.makeNoise();
		}
	}
}

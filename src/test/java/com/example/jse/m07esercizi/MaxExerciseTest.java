package com.example.jse.m07esercizi;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class MaxExerciseTest {

	@Test
	void maxPlain() {
		int[] input = { 4, 6, 3, 7000 };
		int expected = 7000;
		int actual = MaxExercise.max(input);
		assertThat(actual).isEqualTo(expected);

	}

	@Test
	void maxNull() {
		assertThatIllegalArgumentException().isThrownBy(() -> MaxExercise.max(null)); // sto passando al metodo
																						// isthrownby una funzione lambda, anonima
	}

	@Test
	void maxNullClassic() {
		try {
			MaxExercise.max(null);
			fail("Eccezione attesa");
		} catch (IllegalArgumentException ex) {
			assertThat(ex.getMessage()).isEqualTo("Bla bla");
		}
	}
}

package fr.unilim.iut.fizzbuzz;

import java.util.Arrays;
import java.util.List;

public class FizzBuzzReglesFactory {

	public static List<Regle> build() {
		return Arrays.asList(
				new RegleFizzBuzz(),
				new RegleFizz(),
				new RegleBuzz());
	}

}

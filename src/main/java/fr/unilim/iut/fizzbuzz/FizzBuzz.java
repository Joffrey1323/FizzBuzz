package fr.unilim.iut.fizzbuzz;

public class FizzBuzz {

	public String donnerLaReponsePour(Integer nombre) {
		RegleFizzBuzz reglefizzbuzz= new RegleFizzBuzz();

		if (reglefizzbuzz.estVerifeePar(nombre))
			return reglefizzbuzz.valeurAAfficherSiRegleVerifiee();

		if (isBuzz(nombre))
			return "buzz";

		if (isFizz(nombre))
			return "fizz";

		return String.valueOf(nombre);
	}

	private boolean isBuzz(Integer nombre) {
		return 0 == nombre % 5;
	}

	private boolean isFizz(Integer nombre) {
		return 0 == nombre % 3;
	}

}

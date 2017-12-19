package fr.unilim.iut.fizzbuzz;

public class FizzBuzz {

	public String donnerLaReponsePour(Integer nombre) {
		RegleFizzBuzz reglefizzbuzz= new RegleFizzBuzz();
		RegleBuzz regleBuzz= new RegleBuzz();

		if (reglefizzbuzz.estVerifeePar(nombre))
			return reglefizzbuzz.valeurAAfficherSiRegleVerifiee();

		if (regleBuzz.estVerifieePar(nombre))
			return regleBuzz.valeurAAfficherSiRegleVerifiee();

		if (isFizz(nombre))
			return "fizz";

		return String.valueOf(nombre);
	}

	private boolean isFizz(Integer nombre) {
		return 0 == nombre % 3;
	}

}

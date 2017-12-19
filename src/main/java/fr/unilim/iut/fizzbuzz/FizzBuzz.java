package fr.unilim.iut.fizzbuzz;

public class FizzBuzz {

	public String donnerLaReponsePour(Integer nombre) {
		RegleFizzBuzz reglefizzbuzz= new RegleFizzBuzz();
		RegleBuzz regleBuzz= new RegleBuzz();
		RegleFizz regleFizz= new RegleFizz();

		if (reglefizzbuzz.estVerifeePar(nombre))
			return reglefizzbuzz.valeurAAfficherSiRegleVerifiee();

		if (regleBuzz.estVerifieePar(nombre))
			return regleBuzz.valeurAAfficherSiRegleVerifiee();

		if (regleFizz.estVerifieePar(nombre))
			return regleFizz.valeurAAfficherSiRegleVerifiee();

		return String.valueOf(nombre);
	}

}

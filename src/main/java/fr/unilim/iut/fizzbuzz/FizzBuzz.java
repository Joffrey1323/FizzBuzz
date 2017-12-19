package fr.unilim.iut.fizzbuzz;

public class FizzBuzz {

	public String donnerLaReponsePour(Integer nombre) {
		Regle reglefizzbuzz= new RegleFizzBuzz();
		Regle regleBuzz= new RegleBuzz();
		Regle regleFizz= new RegleFizz();

		if (reglefizzbuzz.estVerifieePar(nombre))
			return reglefizzbuzz.valeurAAfficherSiRegleVerifiee();

		if (regleBuzz.estVerifieePar(nombre))
			return regleBuzz.valeurAAfficherSiRegleVerifiee();

		if (regleFizz.estVerifieePar(nombre))
			return regleFizz.valeurAAfficherSiRegleVerifiee();

		return String.valueOf(nombre);
	}

}

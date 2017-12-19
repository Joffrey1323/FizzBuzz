package fr.unilim.iut.fizzbuzz;

public class RegleFizz implements Regle {

	public boolean estVerifieePar(Integer nombre) {
		return 0 == nombre % 3;
	}

	public String valeurAAfficherSiRegleVerifiee() {
		return "fizz";
	}

}

package fr.unilim.iut.fizzbuzz;

public class RegleFizzBuzz implements Regle {

	public boolean estVerifieePar(Integer nombre) {
		return 0 == nombre % (3 * 5);
	}


	public String valeurAAfficherSiRegleVerifiee() {

		return "fizzbuzz";
	}

}

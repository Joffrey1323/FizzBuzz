package fr.unilim.iut.fizzbuzz;

public class RegleFizzBuzz {

	public boolean estVerifeePar(Integer nombre) {
		return 0 == nombre % (3 * 5);
	}


	public String valeurAAfficherSiRegleVerifiee() {

		return "fizzbuzz";
	}

}

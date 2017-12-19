package fr.unilim.iut.fizzbuzz;

import java.util.List;

public class FizzBuzz {
	
	List<Regle> regles= FizzBuzzReglesFactory.build();
	
	
	Regle reglefizzbuzz= new RegleFizzBuzz();
	Regle regleBuzz= new RegleBuzz();
	Regle regleFizz= new RegleFizz();
	public String donnerLaReponsePour(Integer nombre) {
		
		for (Regle regle: regles){
			if (regle.estVerifieePar(nombre)){
				return regle.valeurAAfficherSiRegleVerifiee();
			}
		}

		if (reglefizzbuzz.estVerifieePar(nombre))
			return reglefizzbuzz.valeurAAfficherSiRegleVerifiee();

		if (regleBuzz.estVerifieePar(nombre))
			return regleBuzz.valeurAAfficherSiRegleVerifiee();

		if (regleFizz.estVerifieePar(nombre))
			return regleFizz.valeurAAfficherSiRegleVerifiee();

		return String.valueOf(nombre);
	}

}

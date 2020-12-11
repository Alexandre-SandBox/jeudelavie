package jeuvie;

import controleur.Controleur;
import jeuvie.bestiole.Dauphin;
import jeuvie.ocean.HauteMer;
import jeuvie.ocean.Ocean;
import jeuvie.ocean.vague.LigneEauProfonde;
import jeuvie.ocean.vague.casemer.CaseEauProfonde;


public class JeuVie {

	public static void main(String[] args) {
		
		//new Controleur(new BordDeCote(Ocean.PI));
		//new Controleur(new BordDeCote(Ocean.ALEA));

		//new Controleur(new HauteMer(Ocean.ALEA));
		//new Controleur(new HauteMer(Ocean.BARRE));
		//new Controleur(new HauteMer(Ocean.CANON));
		//new Controleur(new HauteMer(Ocean.CLOWN), Controleur.ITER_CLOWN);
		//new Controleur(new HauteMer(Ocean.PI), Controleur.ITER_PI);
		//new Controleur(new HauteMer(Ocean.GRAND_VAISSEAU));
		//new Controleur(new HauteMer(Ocean.PETIT_VAISSEAU));
		for (int i = 0; i < 20; i++) {
			CaseEauProfonde caseEauProfonde;
			Dauphin dauphin = new Dauphin();
			if (i % 2 == 0) {
				dauphin.tuer();
				caseEauProfonde = new CaseEauProfonde();
			}
			else {				
				caseEauProfonde = new CaseEauProfonde(dauphin, false);
			}
		System.out.println(caseEauProfonde);

		}
	}

}

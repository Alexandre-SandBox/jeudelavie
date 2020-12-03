package jeuvie.ocean.vague.casemer;

import jeuvie.Couleur;
import jeuvie.bestiole.Dauphin;
import jeuvie.ocean.IOcean;

public class CaseEauProfonde extends Case {


	/**
	 * Case vide sans occupant
	 */
	public CaseEauProfonde() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	/**
	 * Case  peut générer n'importe quel type de case
	 */
	public CaseEauProfonde(Dauphin occupant, boolean vide) {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void setBestioleVivante() {
		//TODO
	}

	/**
	 * À chaque étape, l’évolution d’une cellule est entièrement déterminée par l’état de ses huit voisines de la façon suivante :

	 * Une cellule morte possédant exactement trois voisines vivantes devient vivante (elle naît).
	 * Une cellule vivante possédant deux ou trois voisines vivantes le reste, sinon elle meurt.
	 * @param col la colonne dans la matrice
	 * @param j la ligne dans la matrice
	 * @return si cette case précise doit survivre ou non.
	 */
	public void evoluer(IOcean copie, int col, int lg){
		//TODO
	}

	@Override
	public boolean isVide() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Couleur getCouleurCaseVide() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

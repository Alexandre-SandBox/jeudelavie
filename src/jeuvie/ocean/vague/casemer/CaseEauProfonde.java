package jeuvie.ocean.vague.casemer;

import jeuvie.Couleur;
import jeuvie.bestiole.Dauphin;
import jeuvie.ocean.IOcean;

public class CaseEauProfonde extends Case {
	private static final Couleur VIDE = Couleur.BLEU_SOMBRE; 
	/**
	 * Case vide sans occupant
	 */
	public CaseEauProfonde() {
		super();
	}	
	
	/**
	 * Appelle le construteur parent
	 */
	public CaseEauProfonde(Dauphin occupant, boolean vide) {
		super(occupant,  vide);
	}
	
	protected void setBestioleVivante() {
		this.occupant = new Dauphin();
	}
	
	@Override
	public Couleur getCouleurCaseVide() {
		return CaseEauProfonde.VIDE;
	}
	
	@Override
    public CaseEauProfonde clone(){
        CaseEauProfonde caseEProfonde=null;
        try {
            caseEProfonde = (CaseEauProfonde) super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace(System.err); // non prévu.
        }
        if (!isVide()) {
            caseEProfonde.occupant= ((Dauphin)this.occupant).clone();
        }
        return caseEProfonde;       
        //return new CaseEauProfonde(occupant==null?null:((Dauphin)occupant).clone(), vide);
    }
	/**
	 * À chaque étape, l’évolution d’une cellule est entièrement déterminée par l’état de ses huit voisines de la façon suivante :

	 * Une cellule morte possédant exactement trois voisines vivantes devient vivante (elle naît).
	 * Une cellule vivante possédant deux ou trois voisines vivantes le reste, sinon elle meurt.
	 * @param col la colonne dans la matrice
	 * @param lg la ligne dans la matrice
	 * @return si cette case précise doit survivre ou non.
	 */
	public void evoluer(IOcean copie, int col, int lg){
		
	}
	
}

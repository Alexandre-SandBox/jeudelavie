package jeuvie.bestiole;

import jeuvie.Couleur;


public class Dauphin extends Bestiole{


	/*
	 * Constante
	 */
	private static final Couleur MORT = Couleur.BLEU_MARINE;
	private static final Couleur VIVANT = Couleur.BLEU_GRIS;
	
	/*
	 * Construteur Dauphin appelant le construteur Bestiole
	 */
	public Dauphin() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Couleur getCouleurVivant() {
		// TODO Auto-generated method stub
		return VIVANT;
	}

	@Override
	protected Couleur getCouleurMort() {
		// TODO Auto-generated method stub
		return MORT;
	}
	@Override
    /**
     * Retourne une copie de la bestiole courante, pour ne pas augmenter le compteur.
     * Méthode utilisée lors du calcul de l'océan au temps t+1
     * @return une copie de la bestiole
     */
    public Dauphin clone(){
        //return new Dauphin(this.couleur, this.numero, this.vivante);
        Dauphin dauphin = null;
        try {
            dauphin = (Dauphin) super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace(System.err); // non prévu.
        }
        return dauphin;
    }	
}

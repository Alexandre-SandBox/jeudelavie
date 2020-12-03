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

	public Dauphin(int numero) {
		super(numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Le dauphin numéro "+numero+" est vivant";
	}
	
	@Override
	public int getNumero() {
		// TODO Auto-generated method stub
		return numero;
	}
	@Override
	public boolean isVivante() {
		// TODO Auto-generated method stub
		return vivante;
	}
	@Override
	public Couleur getCouleur() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	protected Couleur getCouleurVivant() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	protected Couleur getCouleurMort() {
		// TODO Auto-generated method stub
		return null;
	}
}

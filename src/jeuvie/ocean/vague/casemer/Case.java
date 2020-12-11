package jeuvie.ocean.vague.casemer;

import jeuvie.Couleur;
import jeuvie.bestiole.IBestiole;

public abstract class Case implements ICase {
	
	protected boolean vide = true;
	protected IBestiole occupant = null;
	public abstract Couleur getCouleurCaseVide();
	protected abstract void setBestioleVivante();
	
	/**
	 * Constructeur vide
	 */
	public Case() {
		super();
	}
	
	/**
	 * Constructeur Case peut générer n'importe quel type de case
	 */
	public Case(IBestiole occupant, boolean vide) {
		super();
		this.occupant = occupant;
		this.vide = vide;
	}

	public void setVivante(){
		setBestioleVivante();
		this.vide = false;
	}	
		
	public boolean isVide() {
		return this.vide;
	}

	public IBestiole getOccupant() {
		return this.occupant;
	}
	
	public Couleur getCouleur(){
		Couleur result = getCouleurCaseVide(); 
		if (!this.vide) {
			result = this.occupant.getCouleur();
		}
		return result;
	}
	
	
	public boolean contientBestioleVivante(){
		return !this.vide && occupant.isVivante();
	}

	
	public void tuerEventuelOccupant(){
		if (!this.vide) {
			this.occupant.tuer();
		}
	}
	@Override
	public String toString() {
		return "Case [occupant=" + occupant + "]";
	}

	

}

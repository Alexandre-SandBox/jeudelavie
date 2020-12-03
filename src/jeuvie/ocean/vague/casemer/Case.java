package jeuvie.ocean.vague.casemer;

import jeuvie.Couleur;
import jeuvie.bestiole.IBestiole;

public abstract class Case implements ICase {
	
	protected boolean vide=true;
	protected IBestiole occupant = null;
	public abstract Couleur getCouleurCaseVide();
	protected abstract void setBestioleVivante();


	public void setVivante(){
		//TODO
	}	

	public Couleur getCouleur(){
		// TODO
		return null;
	}


	public boolean contientBestioleVivante(){
		//TODO
		return true;
	}

	public void tuerEventuelOccupant(){
		//TODO
	}

	

}

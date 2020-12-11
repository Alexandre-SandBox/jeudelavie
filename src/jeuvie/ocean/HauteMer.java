package jeuvie.ocean;

import java.util.ArrayList;
import java.util.List;

import jeuvie.ocean.vague.ILigneEau;
import jeuvie.ocean.vague.LigneEauProfonde;


public class HauteMer extends Ocean {


	private static final int NB_LIGNES = 55;
	private static final int NB_COLONNES = 60;

	
	protected void remplirDeLignesEau() {
		
	}

	public int getNbLignes() {		
		return NB_LIGNES;
	}
	
	public int getNbColonnes() {
		return NB_COLONNES;
	}
	
	@Override
    public HauteMer clone(){
       
        HauteMer hauteMer = null;
        try {
            hauteMer = (HauteMer) super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace(System.err); // non prévu.
        }       
        List<ILigneEau> grilleDupliquee = new ArrayList<ILigneEau> (NB_LIGNES);
        for (ILigneEau uneLigneEau : super.grille) {
            grilleDupliquee.add(((LigneEauProfonde)uneLigneEau).clone());
        }
        hauteMer.grille=grilleDupliquee;
        return hauteMer;
    }
}

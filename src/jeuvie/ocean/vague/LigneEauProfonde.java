package jeuvie.ocean.vague;

import java.util.ArrayList;

import java.util.List;

import jeuvie.ocean.vague.casemer.CaseEauProfonde;
import jeuvie.ocean.vague.casemer.ICase;

public class LigneEauProfonde extends LigneEau {

	public LigneEauProfonde(int taille) {
		super(taille);
	}
	
	protected void remplirDeCasesVides() {
		for (int i = 0; i < getNbColonnes(); i++) {
			super.add(new CaseEauProfonde());
		}
	}
	
	@Override
    public LigneEauProfonde clone(){
        LigneEauProfonde eauProfonde = null;
        try {
        	eauProfonde = (LigneEauProfonde) super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace(System.err); // non prévu.
        }       
        List<ICase> lesCases = new ArrayList<ICase>(nbColonnes);
        for (int i = 0; i < nbColonnes; i++) {           
            CaseEauProfonde laCase = (CaseEauProfonde) super.get(i);
            lesCases.add(laCase.clone());
        }
        eauProfonde.lesCases=lesCases;
        return eauProfonde;
    }
	
}

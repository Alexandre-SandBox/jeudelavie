package jeuvie.ocean.vague;

import java.util.ArrayList;
import java.util.List;

import jeuvie.ocean.vague.casemer.ICase;

public abstract class LigneEau implements ILigneEau {
	
	protected final int nbColonnes;

	protected List<ICase> lesCases;

	protected abstract void remplirDeCasesVides();

	protected LigneEau(int taille){
		this.nbColonnes = taille;
		this.lesCases = new ArrayList<ICase>(taille);
		this.remplirDeCasesVides();
	}
	
	public ICase get(int i) {
		return this.lesCases.get(i);
	}
	
	public int getNbColonnes() {
		return nbColonnes;
	}
	
	protected boolean add(ICase element){
		return this.lesCases.add(element);
	}	
	
}

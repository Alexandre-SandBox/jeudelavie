package jeuvie.bestiole;
import jeuvie.Couleur;

public abstract class Bestiole implements IBestiole {

	private static int compteur = 0;

	protected abstract Couleur getCouleurVivant();
	protected abstract Couleur getCouleurMort();	
	
	protected Couleur couleur; 

	protected final int numero;
	protected boolean vivante=true; 
	
	public Bestiole() {
		super();
		this.numero = Bestiole.compteur++;
		this.couleur = getCouleurVivant();
		// TODO Auto-generated constructor stub
	}
	
	public void tuer(){
		this.vivante = false;
		this.couleur = getCouleurMort();
	}
	
	public int getNumero() {
		return this.numero;
	}
	public Couleur getCouleur() {
		return this.couleur;
	}

	public boolean isVivante() {
		return this.vivante;
	}
		
	@Override
	public String toString() {
		return "Bestiole [couleur=" + couleur + ", numero=" + numero + ", vivante=" + vivante + "]";
	}
	

}

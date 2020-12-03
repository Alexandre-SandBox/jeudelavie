package jeuvie.bestiole;
import jeuvie.Couleur;

public abstract class Bestiole implements IBestiole {



	private static int compteur = 0;

	protected abstract Couleur getCouleurVivant();
	protected abstract Couleur getCouleurMort();	
	
	protected Couleur couleur; 
	protected final int numero;
	protected boolean vivante=true; 
	
	public void tuer(){
	//TODO
		setVivante(false);
	}
	
	public boolean isVivante() {
		return vivante;
	}
	public void setVivante(boolean vivante) {
		this.vivante = vivante;
	}
	public Bestiole(int numero) {
		super();
		this.numero = numero;
		// TODO Auto-generated constructor stub
	}
}

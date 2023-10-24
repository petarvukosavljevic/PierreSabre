package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	public void parler(String texte) {
		System.out.println(this.getNom() + " - " + texte);
	}
	
	public void direBonjour() {
		this.parler("Bonjour ! Je m'appelle " + this.getNom() + " et j'aime boire du " + this.boissonFavorite + ".");
	}
	
	public void boire() {
		this.parler("Mmmmm, un bon verre de " + this.boissonFavorite + " ! GLOUPS !");
	}
	
	public void gagnerArgent(int gain) {
		this.argent += gain;
	}
	
	public void perderArgent(int perte) {
		this.argent -= perte;
	}
	
	public void acheter(String bien, int prix) {
		if(this.argent < prix) {
			parler("Je n'ai plus que " + this.argent + " sous en poche. Je ne peux meme pas m'offrir " + bien + " a " + prix + " sous.");
		} else {
			parler("J'ai " + this.argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " a " + prix + " sous.");
			this.perderArgent(prix);
		}
	}
}

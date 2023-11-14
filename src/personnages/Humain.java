package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	protected int nbConnaissance = 0;
	protected Humain[] memoire = new Humain[30];
	
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}
	
	public Humain[] getMemoire() {
		return memoire;
	}

	public String getBoissonFavorite() {
		return boissonFavorite;
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
	
	public void perdreArgent(int perte) {
		this.argent -= perte;
	}
	
	public void acheter(String bien, int prix) {
		if(this.argent < prix) {
			parler("Je n'ai plus que " + this.argent + " sous en poche. Je ne peux meme pas m'offrir " + bien + " a " + prix + " sous.");
		} else {
			parler("J'ai " + this.argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " a " + prix + " sous.");
			this.perdreArgent(prix);
		}
	}
	
	private void memoriser(Humain humain) {
		if (this.nbConnaissance < this.memoire.length) {
			this.memoire[this.nbConnaissance] = humain;
			this.nbConnaissance++;
		} else {
			for (int i = 0; i<this.memoire.length-1; i++) {
				this.memoire[i] = this.memoire[i+1];
			}
			this.memoire[this.memoire.length-1] = humain;
		}
	}
	
	private void repondre(Humain humain) {
		this.direBonjour();
		this.memoriser(humain);
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		this.direBonjour();
		autreHumain.repondre(this);
		this.memoriser(autreHumain);
	}
	
	public void listerConnaissance() {
		String phrase = "Je connais beaucoup de monde dont : ";
		for (int i = 0; i < this.nbConnaissance; i++) {
			phrase += this.memoire[i].getNom();
			if (i != this.nbConnaissance-1) phrase += ", ";
		}
		this.parler(phrase);
	}
}

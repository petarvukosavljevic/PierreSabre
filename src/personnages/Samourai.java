package personnages;

public class Samourai extends Humain {
	private String seigneur;
	
	public Samourai(String seigneur, String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
		this.seigneur = seigneur;
	}
	
	public String getSeigneur() {
		return seigneur;
	}

	@Override
	public void direBonjour() {
		this.parler("Bonjour ! Je m'appelle " + this.getNom() + " et j'aime boire du " + this.getBoissonFavorite() + ".");
		this.parler("Je suis fier de servir le seigneur " + this.seigneur);
	}
	
	
	public void boire(String boisson) {
		this.parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du " + boisson + ".");
	}

}

package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}
	
	
	
	@Override
	public void direBonjour() {
		this.parler("Bonjour ! Je m'appelle " + this.getNom() + " et j'aime boire du " + this.getBoissonFavorite() + ".");
		this.parler("Mon clan est celui de " + this.clan);
	}
	
	public void extorquer(Commercant victime) {
		this.parler(victime.getNom() + ", si tu tiens a la vie donne moi ta bourse!");
		int argentExtorquer = victime.seFaireExtorquer();
		this.gagnerArgent(argentExtorquer);
		this.reputation++;
		this.parler("J'ai pique " + argentExtorquer + " sous de " + victime.getNom() + ", ce qui me fait " + this.getArgent() + " dans ma poche. Hi ! Hi !");
	}
	
	public int perdre() {
		int argentPerdu = getArgent();
		parler("J'ai perdu mon duel et mes " + argentPerdu + " sous, snif... J'ai deshonore le clan de " + clan + ".");
		perdreArgent(argentPerdu);
		reputation--;
		return argentPerdu;
	}
	
	public void gagner(int gain) {
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + "? Je l'ai depouille de ses " + gain + " sous.");
		gagnerArgent(gain);
		reputation++;
	}

	public int getReputation() {
		return reputation;
	}
	
	
}

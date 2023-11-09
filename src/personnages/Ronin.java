package personnages;

public class Ronin extends Humain{
	private int honneur = 1;
	
	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int argentDonner = (int) (this.getArgent() * 0.1);
		parler(beneficiaire.getNom() + " prend ses " + argentDonner + " sous.");
		beneficiaire.recevoir(argentDonner);
		this.perdreArgent(argentDonner);
		this.honneur++;
	}
	
	public void provoquer(Yakuza adversaire) {
		
		parler("Je t'ai retrouve vermine, tu vas payer pour ce que tu as fait a ce pauvre marchand!");
		int force = honneur * 2;
		int reputationYakuza = adversaire.getReputation();
		
		if (force >= reputationYakuza) {
			parler("Je t'ai eu petit yakuza!");
			int argentGagne = adversaire.perdre();
			gagnerArgent(argentGagne);
			honneur++;
			
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			int argentPerdu = getArgent();
			honneur--;
			adversaire.gagner(argentPerdu);
			perdreArgent(argentPerdu);
		}
	}
	
}

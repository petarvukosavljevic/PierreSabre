package personnages;

import java.util.Random;

public class Traitre extends Samourai {

	private int niveauTraitrise = 0;
	
	public Traitre(String seigneur, String nom, String boissonFavorite, int argent) {
		super(seigneur, nom, boissonFavorite, argent);
		this.niveauTraitrise = niveauTraitrise;
	}
	
	@Override
	public void direBonjour() {
		this.parler("Bonjour ! Je m'appelle " + this.getNom() + " et j'aime boire du " + this.getBoissonFavorite() + ".");
		this.parler("Je suis fier de servir le seigneur " + this.getSeigneur());
		this.parler("Mais je suis un traître et mon niveau de traîtrise est : " + this.niveauTraitrise + " Chut !");
	} 
	
	public void ranconner(Commercant commercant) {
		if(this.niveauTraitrise < 3) {
			int argentCommercant = commercant.getArgent();
			int argentRanconner = argentCommercant * 2 / 10;
			commercant.perdreArgent(argentRanconner);
			this.gagnerArgent(argentRanconner);
			this.niveauTraitrise++;
			this.parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi" + argentRanconner + " sous ou gare à toi !");
			commercant.parler("Tout de suite grand" + this.getNom() + ".");
		} else {
			this.parler("Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !");
		}
	}
	
	public void faireLeGentil() {
		if (this.nbConnaissance < 1) {
			this.parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif");
		} else {
			Random num = new Random();
			int amiRand = num.nextInt(this.nbConnaissance);
			int don = this.getArgent() / 20;
			Humain randAmi = this.getMemoire()[amiRand];
			String nomAmi = randAmi.getNom();
			this.parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec" + nomAmi + ".");
			this.parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant " + don + " sous.");
			this.perdreArgent(don);
			
		}
	}
}

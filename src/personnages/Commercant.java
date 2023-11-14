package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "the", argent);
		
	}

	public void recevoir(int argent) {
		this.parler(argent + " sous! Je te remercie genereux donateur!");
		this.gagnerArgent(argent);
	}

	public int seFaireExtorquer() {
		this.parler("J'ai tout perdu! Le monde est trop injuste...");
		int argentExtorquer = this.getArgent();
		this.perdreArgent(argentExtorquer);
		return argentExtorquer;
	}
}

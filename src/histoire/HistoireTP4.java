package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {

	public static void main(String[] args) {
//		Humain humain = new Humain("Prof", "kombucha", 54);
//		humain.direBonjour();
//		humain.acheter("une boisson", 12);
//		humain.boire();
//		humain.acheter("un jeu", 2);
//		humain.acheter("kimino", 50);
		
		Commercant marco = new Commercant("Marco", 15);
//		marco.direBonjour();
//		marco.seFaireExtorquer();
//		marco.recevoir(15);
//		marco.boire();
		
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
//		yaku.direBonjour();
//		yaku.parler("Tiens tiens, ne serait-ce pas un faible marchand qui passe par la?");
//		yaku.extorquer(marco);
		
		Ronin roro = new Ronin("Roro", "shochu", 60);
//		roro.direBonjour();
//		roro.donner(marco);
		
		roro.provoquer(yaku);
		
	}

}

package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		
		AdressePostale a = new AdressePostale();
		a.numeroDeRue = 7;
		a.libelleRue = "Rue La Croix";
		a.codePostale = 56000;
		a.ville = "Vannes";
		
		
		AdressePostale b = new AdressePostale();
		b.numeroDeRue = 10;
		b.libelleRue = "Rue la Belle";
		b.codePostale = 56450;
		b.ville = "Surzur";

	}

}

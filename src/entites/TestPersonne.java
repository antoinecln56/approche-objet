package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		Personne p1 = new Personne("Clain", "Antoine");

		AdressePostale a = new AdressePostale(7, "Rue La Croix", 56000, "Vannes");
		
		Personne p2 = new Personne("Clain", "Antoine", a);
		

	}
	

}

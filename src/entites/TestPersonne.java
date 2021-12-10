package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		Personne p1 = new Personne();
		p1.nom = "Clain";
		p1.prenom = "Antoine";
		
		AdressePostale a = new AdressePostale();
		a.numeroDeRue = 7;
		a.libelleRue = "Rue La Croix";
		a.codePostale = 56000;
		a.ville = "Vannes";
		
		p1.adresse = a;

	}

}

package entites2;

import entites.AdressePostale;

public class Personne {
	
	 public String nom;
	 public String prenom;
	 public AdressePostale adresse;
	 
	 public Personne(String nomP, String prenomP){
		 
		 nom = nomP;
		 prenom = prenomP;
		 
	 }
	 
	 public Personne(String nomPe, String prenomPe, AdressePostale adresseP) {
		 
		 nom = nomPe;
		 prenom = prenomPe;
		 adresse = adresseP;
		 
	 }
	 
	 // Il y a besoin de beaucoup moins de lignes pour instancier une personne

}

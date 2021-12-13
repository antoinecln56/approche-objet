package entites2;

import entites.AdressePostale;

public class Personne {
	
	 public String nom;
	 public String prenom;
	 public AdressePostale adresse;
	 
	 
	 public Personne() {
		 
	 }

	 public Personne(String nomP, String prenomP){
		 
		 this.nom = nomP;
		 this.prenom = prenomP;
		 
	 }
	 
	 public Personne(String nomPe, String prenomPe, AdressePostale adresseP) {
		 
		 this.nom = nomPe;
		 this.prenom = prenomPe;
		 this.adresse = adresseP;
		 
	 }
	 
	 /*
	 public static void main(String[] args) {
			
		 
		 String nomP;
		 String prenomP;
		 
		 
		 nomP = "Clain";
		 prenomP = "Antoine";
		 
		 System.out.println(nomP.toUpperCase() + " " + prenomP);
		 
	 }
	 */

	 
	 
	 public String nomPrenom(String nomP, String prenomP) {
		 
		 
		 return nomP.toUpperCase() + " " + prenomP;
		 
		 
	 }
	 
	 //Methode 1 argument qui permet de modifier variable d'instance nom de Personne
	 
	 public void SetNom(String nomP) {
		 
		 this.nom = nomP;
		 
	 }
	 
	 
	//Modifie le prenom
	 
	 public void SetPrenom(String prenomP) {
		 
		 this.prenom = prenomP;
		 
	 }
	 
	 //Modifie l adresse
	 
	 public void SetAdresse(AdressePostale adresseP) {
		 
		 this.adresse = adresseP;
		 
	 }
	 
	 
	 // Retourne le nom
	 
	 public String GetNom() {
		 
		 return this.nom;
		 
	 }
	 
	 
	 // Retourne le prenom
	 
	 public String GetPrenom() {
		 
		 return this.prenom;
		 
	 }
	 
	 
	 // Retourne l'adresse
	 
	 public AdressePostale GetAdresse() {
		 
		 return this.adresse;
		 
	 }
	 
	 
	 
}

package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	
	int taux;
	
	
	public CompteTaux(int numero, long solde, int tauxC) {
		
		this.numeroCompte = numero; // passer les attributs de la classe Compte en protected ou utiliser getters/setters
		this.soldeCompte = solde;
		this.taux = tauxC;
		
	}
	
	public String toString() {
		
	
		return super.toString()  + " et le taux est de : " + taux + "%";
		
	}
	

}

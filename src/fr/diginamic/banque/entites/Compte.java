package fr.diginamic.banque.entites;

public class Compte {
	
	protected int numeroCompte;
	protected long soldeCompte;
	
	

	
	public Compte(){
		
	 }

	
	public Compte(int numero, long solde){
		 
		 this.numeroCompte = numero;
		 this.soldeCompte = solde;
		 
	 }
	
	public String toString() {
		
		return "le num�ro de compte est : " +  numeroCompte + " et le solde du compte est de : "  + soldeCompte;
		
	}
	


}

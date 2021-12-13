package fr.diginamic.banque.entites;

public class Compte {
	
	private int numeroCompte;
	private long soldeCompte;
	
	

	
	public Compte(){
		
	 }

	
	public Compte(int numero, long solde){
		 
		 this.numeroCompte = numero;
		 this.soldeCompte = solde;
		 
	 }
	
		public String toString() {
		
			return "le numéro de compte est : " +  numeroCompte + " et le solde du compte est de : "  + soldeCompte;
		
		}


}

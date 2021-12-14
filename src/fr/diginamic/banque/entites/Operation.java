package fr.diginamic.banque.entites;

public abstract class Operation {
	
	protected String date;
	protected int montant;
	
	
	public Operation(String dateO, int montantO) {
		
		this.date = dateO;
		this.montant = montantO;
		
	}
	
	public int getMontant() {
		
		return montant;
	}
	
	
	public String toString() {
		
		return "la date est : " +  date + " et le montant est de : "  + montant;
		
	}
	
	public abstract String getType();
	

}

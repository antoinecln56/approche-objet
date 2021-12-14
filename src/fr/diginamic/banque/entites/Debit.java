package fr.diginamic.banque.entites;

public class Debit extends Operation {

	
	String Type = "DEBIT";
	
	public Debit(String dateO, int montantO) {
		super(dateO, montantO);
		
	}
	
	
	public String getType() {
		
		return Type;
	}

}

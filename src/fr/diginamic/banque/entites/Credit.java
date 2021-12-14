package fr.diginamic.banque.entites;

public class Credit extends Operation {

	
	String Type = "CREDIT";
	
	
	public Credit(String dateO, int montantO) {
		super(dateO, montantO);
		
	}
	
	public String getType() {
		
		return Type;
	}

}

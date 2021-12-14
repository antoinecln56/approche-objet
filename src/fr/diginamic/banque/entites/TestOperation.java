package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
			
		Operation[] operations = new Operation[4];
		operations[0] = new Credit("28/03/2020", 147);
		operations[1] = new Credit("28/03/2020", 155);
		operations[2] = new Debit("28/03/2020", 380);
		operations[3] = new Debit("28/03/2020", 376);
		
		int resultat = 0;
		
		
		for (int i = 0; i<operations.length; i++) {
			
			//System.out.println(operations[i]);
			//System.out.println(operations[i].getType());
			
			if (operations[i].getType().equals("CREDIT")) {
				
				resultat = resultat + operations[i].getMontant();
				
			}else if(operations[i].getType().equals("DEBIT") ) {
				
				resultat = resultat - operations[i].getMontant();
				
			}
			System.out.println("Le résultat est : " + resultat);
		}

	}

}

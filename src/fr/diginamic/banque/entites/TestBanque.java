package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		
		Compte infos = new Compte(158, 15486520);
		Compte infosTaux = new CompteTaux(158, 15486520, 10);
		//System.out.println(infos);
		//System.out.println(infosTaux);
		
		Compte[] compte = new Compte[2];
		compte[0] = infos;
		compte[1] = infosTaux;
		
		for (int i = 0; i<compte.length; i++) {
			
			System.out.println(compte[i]);
			
		}
		
		
		
		
		

	}

}

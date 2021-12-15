package liste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {
		
		List<Integer> liste = new ArrayList<Integer>();
		liste.add(-1);
		liste.add(5);
		liste.add(7);
		liste.add(3);
		liste.add(-2);
		liste.add(4);
		liste.add(8);
		liste.add(5);
		
		// Afficher la liste et sa taille 
		
		System.out.println(liste);
		System.out.println(liste.size());
		
		
		// Afficher l'entier le plus grand 
		
		int maxi = Collections.max(liste);
	    System.out.println(maxi);
		
		// Supprimer entier le plus petit de la liste
		
		liste.remove(4);
		System.out.println(liste);
		
		// Rechercher éléments négatifs et modifier pour qu'ils deviennent positifs
		
		for (int i = 0; i <= 4; i++){
			
			int entier = liste.get(i);
			
			if(entier < 0) {
				
				liste.set(i, - entier);
				
			}
			
		}
		System.out.println(liste);
		

		
		

		
		
		
		
		
		
	}

}

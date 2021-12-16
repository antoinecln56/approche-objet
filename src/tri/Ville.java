package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Ville implements Comparable<Ville> {
	
	public String nom;
	public int nbHabitants;
	
	public Ville(String nom, int nbHabitants) {
		
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		
	}
	
	
	public int compareTo(Ville tri) {
		
		//return this.nom.compareTo(tri.nom);
		if(this.nbHabitants > tri.nbHabitants) {
			return 1;
		}
		if(this.nbHabitants < tri.nbHabitants) {
			return -1;
		}
		return 0;
		
	}
	
	
	public String toString() {
		
		return " Ville : " + nom + " habitants : " + nbHabitants;
	}
	
	

	public static void main(String[] args) {
		
		
		// ArrayList de villes contenant des villes et le nombre d'habitants
		
		List<Ville> villes = new ArrayList<>();
		villes.add(new Ville("Nice", 343_000));
		villes.add(new Ville("Carcassonne", 47_800));
		villes.add(new Ville("Narbonne", 53_400));
		villes.add(new Ville("Lyon", 484_000));
		villes.add(new Ville("Foix", 9700));
		villes.add(new Ville("Pau", 77_200));
		villes.add(new Ville("Marseille", 850_700));
		villes.add(new Ville("Tarbes", 40_600));
		
		/*
		Collections.sort(villes);
		
		for(Ville villeP : villes) {
			
			System.out.println(villeP);
		}
		*/
		
		ComparatorHabitant triHabitants = new ComparatorHabitant();
		Collections.sort(villes, triHabitants);
		
		for(Ville villeP : villes) {
			
			System.out.println(villeP);
		}
		
		
		System.out.println("\n");
		
		
		
		ComparatorNom triNom = new ComparatorNom();
		Collections.sort(villes, triNom);
		
		for(Ville villeP : villes) {
			
			System.out.println(villeP);
		}
		
		
	}

}

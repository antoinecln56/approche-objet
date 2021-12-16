package liste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Ville {
	
	public String nom;
	public int nbHabitants;
	
	public Ville(String nom, int nbHabitants) {
		
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		
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
		
		
		// Recupérer la ville avec le plus d'habitants et l'afficher
		
		Ville maxHabitants = villes.get(0); // Prend la liste et commence à l'index 0
		Ville minHabitants = villes.get(0);
		
		for(Ville villeP: villes) {
			
			if(villeP.nbHabitants > maxHabitants.nbHabitants) {
				
				maxHabitants = villeP;
				
			}
			
		}
		System.out.println(maxHabitants.nom);
		
		
		// Recupérer la ville avec le moins d'habitants et la supprimer
		
		for(Ville villeP: villes) {
			
			if(villeP.nbHabitants < minHabitants.nbHabitants) {
				
				minHabitants = villeP;
				
			}
			
		}
		System.out.println(minHabitants.nom);
		villes.remove(minHabitants);
		System.out.println(villes);
		
		// Recuperer les villes de + de 100 000 habitants et les afficher en majuscule
		
		for(Ville villeP: villes) {
			
			if(villeP.nbHabitants > 100000) {
				
				villeP.nom = villeP.nom.toUpperCase();
				
			}
			
		}
		System.out.println(villes);
		
		
		
	}

}

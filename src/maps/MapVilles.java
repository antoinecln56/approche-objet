package maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import liste.Ville;
import sets.Pays;


public class MapVilles {

	public static void main(String[] args) {
		
		HashMap<String, Ville> villes = new HashMap<>();
		villes.put("Nice", new Ville("Nice", 343000));
		villes.put("Carcassonne", new Ville("Carcassonne", 47800));
		villes.put("Narbonne", new Ville("Narbonne", 53400));
		villes.put("Lyon", new Ville("Lyon", 484000));
		villes.put("Foix", new Ville("Foix", 9700));
		villes.put("Pau", new Ville("Pau", 77200));
		villes.put("Marseille", new Ville("Marseille", 850700));
		villes.put("Tarbes", new Ville("Tarbes", 40600));
		

		
		Ville minHabitants = null;
		
		for(Ville villeP: villes.values()) {
			
			
			if(minHabitants == null) {
				
				minHabitants = villeP;
			
			}
			
			
			if(villeP.nbHabitants < minHabitants.nbHabitants) {
				
				minHabitants = villeP;
				
			}
			
		}
		
		System.out.println(minHabitants.nom);
		villes.remove(minHabitants.nom);
		
		for(Ville villeP: villes.values()) {
			
			System.out.println(villeP);
			
		}

	}

}

package maps;

import java.util.HashMap;


import liste.Ville;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		
		
		String cle = "Ensemble des clés dans la map :";
		for(Integer cp : mapVilles.keySet()) {
			
			cle += " " + cp;
			
		}
		System.out.println(cle);
		
		
		
		String valeur = "Ensemble des valeurs dans la map :";
		for(String ville : mapVilles.values()) {
			
			valeur += " " + ville;
			
		}
		System.out.println(valeur);
		
		System.out.println("Taille de la map : " + mapVilles.size());
		
	}

}

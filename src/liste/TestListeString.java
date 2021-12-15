package liste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class TestListeString {

	public static void main(String[] args) {
		
		List<String> liste = new ArrayList<String>();
		liste.add("Nice");
		liste.add("Carcassonne");
		liste.add("Narbonne");
		liste.add("Lyon");
		liste.add("Foix");
		liste.add("Pau");
		liste.add("Marseille");
		liste.add("Tarbes");
		

		// Rechercher la ville qui a le plus grand nombre de lettres 
		
		String ville = "";
		
		for(String listeVille: liste) {
			
			if(listeVille.length() > ville.length()) {
				
				ville = listeVille;
			}
			
		}
		System.out.println("La ville est : " + ville);
		
		
		
		// Modifiez le contenu de la liste pour mettre tous les noms de villes en majuscules 
		
		for(int i = 0; i < liste.size(); i++) {
			
			liste.set(i, liste.get(i).toUpperCase());
				
		}
		System.out.println(liste);
		
		// Suprimmer les villes commencant par N
		
		
		for(String listeVille : new ArrayList<String>(liste)) {
			
			if(listeVille.charAt(0) == 'N') {
				
				liste.remove(listeVille);
				
			}
		}
		System.out.println(liste);
		
		
		// Même chose mais avec un while
		
		Iterator<String> iterator = liste.iterator();
		
		while(iterator.hasNext()) {
			
			String listeVille = iterator.next();
			
			if(listeVille.charAt(0) == 'N') {
				
				iterator.remove();
				
			}
			
		}
		System.out.println(liste);
		
		
		
		
	}

}

package tri;

import java.util.Comparator;

public class ComparatorNom implements Comparator<Ville> {
	
	public int compare(Ville n1, Ville n2) {
		
		int result = n1.nom.compareTo(n2.nom);

		return result;
			
		
	}

}

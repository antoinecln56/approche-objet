package tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {
	
	public int compare(Ville v1, Ville v2) {
		

		return v1.nbHabitants - v2.nbHabitants;
			
		
	}

}

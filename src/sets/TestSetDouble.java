package sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class TestSetDouble {

	public static void main(String[] args) {
		
		HashSet<Double> set = new HashSet<>();
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);
		
		// Affichage Collection
		
		System.out.println(set);
		
		
		// Plus grand �l�ment de la collection
		
		double maxi = Collections.max(set);
	    System.out.println(maxi);
	    
	    // Supprimer le plus petit �l�ment
	    
	    set.remove(-12.45);
	    System.out.println(set);


	}

}

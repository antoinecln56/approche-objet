package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {

	public static void main(String[] args) {
		
		
		HashSet<String> set = new HashSet<>();
		set.add("USA");
		set.add("France");
		set.add("Allemagne");
		set.add("UK");
		set.add("Italie");
		set.add("Japon");
		set.add("Chine");
		set.add("Russie");
		set.add("Inde");
		
		
		
		String ville = "";
		
		for(String plusGrand : set) {
			
			if(plusGrand.length() > ville.length()) {
				
				ville = plusGrand;
				
				
			}
		}
		System.out.println(ville);
		set.remove(ville);
		System.out.println(set);
		
		

		
	}

}

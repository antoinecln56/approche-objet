package listes;

import java.util.ArrayList;
import java.util.List;


public class CreationListe {
	
	public static void main(String args[]) {
		
		List<Integer> list = new ArrayList<>();
		
		
		
		for (int i = 0; i <= 99; i++){
			
			//int[] tableau = new int[1];
			list.add(i);
			System.out.println(list.size());
			
			
		}
		
		
		
	}

}

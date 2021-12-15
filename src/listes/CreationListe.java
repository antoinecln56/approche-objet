package listes;

import java.util.ArrayList;
import java.util.List;


public class CreationListe {
	
	public static void main(String args[]) {
		
		List<int[]> list = new ArrayList<>();
		
		
		
		for (int i = 0; i <= 99; i++){
			
			int[] tableau = new int[1];
			list.add(tableau);
			System.out.println(list.size());
			
		}
		
		
		
	}

}

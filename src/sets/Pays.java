package sets;

import java.util.HashSet;
import java.util.Iterator;

public class Pays {

	String nom;
	long nbHabitants;
	int pibHabitant;
	
	public Pays(String nom, long nbHabitants, int pibHabitant) {
		
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibHabitant = pibHabitant;
		
	}
	
	public int getPib() {
		
		return this.pibHabitant;
	}
	
	public String toString() {
		
		return "Pays : " + nom + " Nombre d'habitants : " + nbHabitants + " PIB par habitant : " + pibHabitant;
		
	}
	
	public long getPibTotal() {
		
		return pibHabitant * nbHabitants;
		
	}
	
	
	public static void main(String[] args) {
		
		HashSet<Pays> pays = new HashSet<Pays>();
		pays.add(new Pays("USA", 329_500_000, 63_543));
		pays.add(new Pays("France", 67_390_000, 38_625));
		pays.add(new Pays("Allemagne", 83_240_000, 45_723));
		pays.add(new Pays("UK", 67_220_000, 40_284));
		pays.add(new Pays("Italie", 59_550_000, 31_676));
		pays.add(new Pays("Japon", 125_800_000, 40_113));
		pays.add(new Pays("Chine", 1_402_000_000, 10_500));
		pays.add(new Pays("Russie", 144_100_000, 10_126));
		pays.add(new Pays("Inde", 1_380_000_000, 1900));
		
		
		
		Pays pibMax = pays.iterator().next();
		
		for(Pays pib : pays) {
			
			
			if(pibMax.getPib() < pib.getPib()) {
				
				pibMax = pib;
				
			}
		}
		System.out.println(pibMax);
		
		
		
		
		Pays pibMaxTotal = pays.iterator().next();
		
		for(Pays pibTotal : pays) {
			
			
			if(pibMaxTotal.getPibTotal() < pibTotal.getPibTotal()) {
				
				pibMaxTotal = pibTotal;
				
			}
		}
		System.out.println("Le PIB total le plus élevé est : " + pibMaxTotal);
		
		
		Pays pibMinTotal = pays.iterator().next();
		
		for(Pays pibTotal : pays) {
			
			
			if(pibMinTotal.getPibTotal() > pibTotal.getPibTotal()) {
				
				pibMinTotal = pibTotal;
				
			}
		}
		System.out.println("Le PIB total le plus bas est : " + pibMinTotal.nom.toUpperCase());
		pays.remove(pibMinTotal);
		
		// Affichage de la collection
		for (Pays paysListe : pays) {

			System.out.println(paysListe);
		}
		
	}



}

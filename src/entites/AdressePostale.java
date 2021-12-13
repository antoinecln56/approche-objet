package entites;

public class AdressePostale {
	
	int numeroDeRue;
	String libelleRue;
	int codePostale;
	String ville;

	
	
	 public AdressePostale() {
		 
	 }
	 
	 
	public AdressePostale(int numRue, String libRue, int code, String nville){
		this.numeroDeRue = numRue;
		this.libelleRue = libRue;
		this.codePostale = code;
		this.ville = nville;
	}
	
	
	
	

}

package interfaces;

public class Rectangle implements ObjetGeometrique {
	
	int longueur;
	int largeur;
	
	
	public Rectangle(int longueur, int largeur) {
		
		this.longueur = longueur;
		this.largeur = largeur;
		
	}
	
	@Override
	public double perimetre() {
		
		double perimetre =  2 * longueur + 2 * largeur;
		return perimetre;
	}
	
	
	@Override
	public double surface() {
		
		
		double surface = longueur * largeur;
		return surface;
	}
	
	

}

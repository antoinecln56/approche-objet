package interfaces;

public class Cercle implements ObjetGeometrique {
	
	double rayon;

	
	
	public Cercle(double rayonC) {
		
		this.rayon = rayonC;
		
	}
	
	
	@Override
	public double perimetre() {
		
		double perimetre = 2 * Math.PI * rayon;
		return perimetre;
	}

	@Override
	public double surface() {
		
		double surface = rayon * rayon * Math.PI;		
		return surface;
		
	}
	



}

package interfaces;

public class TestObjetGeometrique {
	
	public static void main(String[] args) {
		
		ObjetGeometrique[] objetGeometrique = new ObjetGeometrique[2];
		objetGeometrique[0] = new Cercle(7);
		objetGeometrique[1] = new Rectangle(5, 12);
		
		
		for (int i = 0; i<objetGeometrique.length; i++) {
			
			System.out.println("Pemimètre : " +  objetGeometrique[i].perimetre());
			System.out.println("Surface : " +  objetGeometrique[i].surface());
			
		}
	}

}

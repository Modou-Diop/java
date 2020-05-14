public abstract class Figure{

	protected double longueur;
	private static String unite;

	public Figure(){
 
	}
	public double getLongueur(){
	     return this.longueur;
	}
	public void setLongueur(double longueur){
	     this.longueur=longueur;
	}

	public static String getUnite(){
	     return Figure.unite;
	}
	public static void setUnite(String unite){
	     Figure.unite=unite;
	}

	public abstract double demiPerimetre();
	public abstract double surface();
	public abstract double diagonale();
	
	public double perimetre(){
	    return this.demiPerimetre()*2;
	}


}
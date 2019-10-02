
public class Fraction {
	
	private int numerateur; 
    private int denominateur;

	/**
	 * Constructeur d'un nombre rationnel
     * 2 param�tres entiers
     * @param numerateur
     * @param denominateur
	 */
	public Fraction(int numera, int denomina){
		numerateur=numera;
		denominateur=denomina;
		
	}
	
	/**
	 * Methode de presentation
	 */
	public String toString(){
		
		return "numerateur: "+numerateur+" et comme denominateur: "+denominateur;
	}
}

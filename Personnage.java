abstract class Personnage extends Victime{

	/** attributs de la classe
	* non modifiables
	* le nom du personnage et son nombre de points de vie
	*/
	private String nom;
	private int points_vie;
	
	/** constructeur qui affecte les caracteristiques
	@param n le nom (chaine de caractères)
	@param pv le nombre de points de vie 
	*/
	public Personnage(String n, int pv){
	nom=n;
	if (pv <= 0)
		points_vie=1;
	else
		points_vie=pv;
	}
	
	
	/** methode retournant le nom du personnage
	@return nom
	*/
	public String getNom(){
		return nom; 
	} 
	
	/** methode retournant le nombre de points de vie du personnage
	@return points_vie 
	*/
	public int getVie(){
		return points_vie;
	}
	
	/** booleen indiquant l'etat du personnage
	@return true si mort
	*/
	public boolean mort(){
		if(getVie() <= 0) 
			return true;
		else
			return false;
	}
	
	/** methode pour ajouter num points de vie 
	* on peut donner une valeur négative 
	* (alors ça enlève des points de vie) 
	@param int num : le nombre de points de vie ajoutes ou retires 
	*/ 
	public int addVie(int num){
		points_vie=points_vie+num;
		return points_vie;
	}
	
	/** methode retournant le type du personnage
	sorcier ou monstre
	@return chaine de caracteres 
	*/
	public abstract String getType(); 
	
	
	/** le personnage attaque une autre victime
	* @param v une autre victime
	* methode abstraite car elle depend de la nature de la victime
	*/
	public abstract void attaque(Victime v); 

	
	/** methode subitFrappe 
	* ce qui se passe quand le personnage est frappe par un monstre
	* (seuls les monstres frappent)  
	* @param int coup 
	*/
	public abstract int subitFrappe(int coup);

	/** methode subitCharme 
	* ce qui se passe quand le personnage est charme par un sorcier
	* (seuls les sorciers charment)
	* @param int coup 
	*/
	public abstract int subitCharme(int coup);
	 
	/** methode pour afficher un personnage 
	@param Personnage p 
	*/	
	public String toString(){
		String s1=("Je m'appelle " + getNom() + " et j'ai " + getVie() + " points de vie"); 
		String s2=(getNom() + " est mort. \n"); 
		if(mort()==true) 
			return s2;
		else
			return s1; 
	}
		
	
}

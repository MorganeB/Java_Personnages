/** Un sorcier est un personnage 
* @see classe Personnage 
* @author Morgane 
* un sorcier peut lancer des charmes / sorts 
* mais pas des coups
*/

class Sorcier extends Personnage{ 

	//un double entre 0 et 1 choisi aleatoirement
	private double pouvoir;
	
	/** constructeur 
	* @param n le nom du sorcier
	* @param pv le nombre de points de vie au depart
	* @param power le nombre au hasard, entre 0 et 1, de son pouvoir 
	*/
	Sorcier(String n, int pv){
		super(n, pv); 
		pouvoir=Math.random();
	}
	
	public double getPouvoir(){
		return pouvoir;
	}
	
	
	/** methode retournant le type du personnage
	sorcier ou monstre
	@return chaine de caracteres 
	*/
	public String getType(){
		return "Sorcier";
	}
	
	/** methode d'attaque :
	Si le sorcier est mort, il ne fait rien.
	Sinon, il charme l’autre personnage avec une force egale  a la moitie de ses points de vie 
	@param v la victime adverse 
	*/
	public void attaque(Victime v){
		if(!mort())
			addVie(v.subitCharme((int)(getVie() * getPouvoir()/2)));
	}
	
	
	/** methode executee par un sorcier lorsqu'il est frappe
     * @param coup : force de la frappe
     * @return blessure infligee en retour
     */
    public int subitFrappe(int coup){
		addVie(-coup);
		int blessure=(int)(getVie() * getPouvoir());
			return blessure;
    }

    /** methode executee par un sorcier lorsqu'il est charme
     * @param coup force du charme
     * @return 0 car le charme n'a pas d'effet sur le sorcier
     */
    public int subitCharme(int coup){
		return 0;
	}
	
}
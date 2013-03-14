/** Un monstre est un personnage 
* @see classe Personnage 
* @author Morgane 
* un monstre peut lancer des coups 
* mais pas des charmes / sorts 
*/

class Monstre extends Personnage{
	
	/** constructeur 
	* @param n le nom du monstre
	* @param pv le nombre de points de vie au depart
	*/
	Monstre(String n, int pv){
		super(n, pv); 
	}
	
	/** methode retournant le type du personnage
	sorcier ou monstre
	@return chaine de caracteres 
	*/
	public String getType(){
		return "Monstre";
	}
	
	/** methode d'attaque :
	* Si le monstre est mort, il ne fait rien.
	* Sinon, il frappe l’autre personnage avec une force egale  a la moitie de ses points de vie 
	* @param v la victime adverse 
	*/
	public void attaque(Victime v){
		if(!mort())
			addVie(-v.subitFrappe(getVie()/2));
	}
	
	/** methode executee par un monstre lorsqu'il est frappe
     * @param coup : force de la frappe
     * @return blessure infligee en retour
     */
    public int subitFrappe(int coup){
		addVie(-coup);
		int blessure=(getVie()/2);
		return blessure;
    }

    /** methode executee par un monstre lorsqu'il est charme
     * @param coup force du charme
     * @return la moitie du reste de ses points de vie 
     */
    public int subitCharme(int coup){
		addVie(-coup);
		int blessure=(getVie()/2);
		return blessure;
	}
	
}



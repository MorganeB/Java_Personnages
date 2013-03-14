class NainJardin extends Victime{

	private int solidite;
	
	//constructeur
	NainJardin(int s){
		solidite=s;
	}
	
	/** Methode retournant la solidite du nain de jardin
	 * les nains et les gnomes n'ont pas de points de vie
	 * mais un entier appele solidite
	 * @return solidite
	*/
	public int getSolidite(){
		return solidite;
	}
	
	public boolean mort(){
		if(solidite<=0)
			return true;
		else
			return false;
	}
	
	/** Methode retournant la chaine de caracteres
	 * "Nain de jardin" car les nains n'ont pas de nom personnalise
	 * @return "Nain de jardin"
	*/
	public String getNom(){
		return "Nain de jardin";
	}
	
	
	/** lorsqu'un monstrefrappe un nain de jardin avec une force coup 
	strictement superieure a sa solidite,
	alors la solidite devient nulle, mais le monstre se blesse quand meme
	@return blessure dont l’intensite est egale a la solidite initiale du nain de jardin)
	sinon 
	@return coup contre le monstre
	*/
	 public int subitFrappe(int coup){
		 int blessure=solidite;
			if(coup>solidite)
					solidite=0;
				return blessure;
	 }
	 
	 public int subitCharme(int coup){
		 return -1;
	 }	 
	
	public void attaque(Victime v){
	}
}
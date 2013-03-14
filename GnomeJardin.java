
class GnomeJardin extends NainJardin implements SuperPouvoir{
	
	GnomeJardin (int s){
		super(s);
	}
	
	/** possibilite de lancer un sort
	 un bonus entre 0 et 1 * la solidite du gnome
	* @return intensite du sort */
	public double sort(){
		return Math.random()* getSolidite();
	}

	/** Methode retournant la chaine de caracteres
	 * "Gnome de jardin" car les gnomes n'ont pas de noms personnalises
	 * @return "Gnome de jardin"
	*/
	public String getNom(){
		return "Gnome de jardin";
	}
	
	/** Lorsqu'un gnome est frappe par un charme
	 * il genere une valeur de sort
	 * et si elle est superieure au coup
	 * il renvoie la valeur de ce coup 
	*/
	public int subitCharme(int coup){
		if(sort()>coup)
			return -coup;
		else
			return (int)sort();
	}
	
	

}

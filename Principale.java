/** classe permettant d'executer les combats
@author Morgane
15 victimes ont ete crees pour eviter d'en saisir à chaque lancement
la partie ou on peut les saisirs est entre commentaires  
*/

import java.util.Scanner;

class Principale{

	//creation d'un tableau de victimes
		private static Victime[] victimes = new Victime[15];
		
	
	/* methode comptant le nombre de 
		victimes vivantes dans le tableau
	*/	
	private static int nbVivants(){
		int i, j;
		j=0;
		for(i=0; i<victimes.length; i++)
			if(!victimes[i].mort())
				j++; 
		return j;
	}
	
	
	/* methode qui parcourt le tableau pour
	trouver au moins un monstre (vu que les sorciers
	ne se font rien entre eux)
	*/
	private static boolean trouveMonstres(){
		int i;
		for(i=0; i<victimes.length; i++)
			if((victimes[i] instanceof Monstre) || (victimes[i] instanceof Magicien) && (!victimes[i].mort())) 
				return true;
		return false;
	}
				
		
	public static void main(String args []){
		Scanner sc=new Scanner(System.in);
		
	/*****************************************************
	********* Instanciation automatique du tableau *******
	******************************************************
	**/
		victimes[0]=new Monstre("Voldemort", (int)(Math.random()*100));
		victimes[1]=new Monstre("Malfoy", (int)(Math.random()*100));
		victimes[2]=new Monstre("Crabbe", (int)(Math.random()*100));
		victimes[3]=new Monstre("Goyle", (int)(Math.random()*100));
		victimes[4]=new Monstre("McNaire", (int)(Math.random()*100));
		victimes[5]=new Monstre("Rocade", (int)(Math.random()*100));
		victimes[6]=new Monstre("Bellatrix", (int)(Math.random()*100));
		victimes[7]=new Monstre("Parkinson", (int)(Math.random()*100));
		victimes[8]=new Sorcier("Harry", (int)(Math.random()*100));
		victimes[9]=new Sorcier("Ron", (int)(Math.random()*100));
		victimes[10]=new Sorcier("Hermione", (int)(Math.random()*100));
		victimes[11]=new Magicien("Dumbledore", (int)(Math.random()*100));
		victimes[12]=new Magicien("Rogue", (int)(Math.random()*100));
		victimes[13]=new GnomeJardin((int)(Math.random()*100));
		victimes[14]=new NainJardin((int)(Math.random()*100));
	
	/*****************************************************
	********* Partie permettant de saisir les noms *******
	******************************************************
	
	//saisie des noms des monstres et instanciation du tableau 
		String nom_monstre, nom_sorcier;
		int i; 
		Monstre monstre;
		for (i=0; i <7; i++){
			System.out.println("Nom du monstre " + (i+1)); 
			monstre = new Monstre(sc.nextLine(), (int)(Math.random()*100)); 
			victimes[i]=monstre; 
		}
		
	//saisie des noms des sorcier et instanciation du tableau 
		Sorcier sorcier;
		for (i=7; i <9; i++){
			System.out.println("Nom du sorcier " +(i-6)); 
			sorcier = new Sorcier(sc.nextLine(), (int)(Math.random()*100), Math.random()); 
			victimes[i]=sorcier; 
		}
		
		System.out.println("Nom du magicien "); 
		Magicien m = new Magicien(sc.nextLine(), (int)(Math.random()*100), Math.random()); 
		victimes[i]=m;
		
	//saisie de 2 nains et d'1 gnome	
		for(i=11; i<=13; i++)
			victimes[i-1]=new NainJardin((int)(Math.random()*100));
		
		
		for(i=14; i<=15; i++)
			victimes[i-1]=new GnomeJardin((int)(Math.random()*100));
			
	
	*/			
	/********************** Fin de saisie ********************
		******************************************************/
	
	/*debut du combat
	il doit y avoir au moins 2 victimes vivants
	et au moins un monstre parmis les 2
	*/
		while(nbVivants() >= 2 &&  trouveMonstres()){
			int perso1=(int)(Math.random()*10);
			while(victimes[perso1].mort())
				perso1=(int)(Math.random()*10);
				
			int perso2=(int)(Math.random()*10);
			while(victimes[perso2].mort() || perso1 == perso2)
				perso2=(int)(Math.random()*10);
				
			while(victimes[perso1]instanceof Sorcier && victimes[perso2] instanceof Sorcier){
				perso2=(int)(Math.random()*10);
				while(victimes[perso2].mort() || perso1 == perso2)
				perso2=(int)(Math.random()*10);
			}	
			System.out.println("\n Personnage 1 " + victimes[perso1].getNom() + " attaque personnage 2 : " + victimes[perso2].getNom() + "\n");	
			System.out.println(victimes[perso1].toString()); 
			System.out.println(victimes[perso2].toString());
			System.out.println("*Attaque*");
			victimes[perso1].attaque(victimes[perso2]);
			System.out.println(victimes[perso1].toString()); 
			System.out.println(victimes[perso2].toString() + "\n");
			
		}
	}
}









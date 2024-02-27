package personnages;

public class Gaulois {
	
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	
	public String getNom() { // getteur utile pour pouvoir appeler (exemple dans druide)
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»"); //void car pas de return
		
	}

	private String prendreParole() { 
		// TODO Auto-generated method stub
		return "Le gaulois " + nom + " : ";
	}


	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "
		+ romain.getNom());
		romain.recevoirCoup(force / 3);
	}

	

	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPo²tion=" + effetPotion + "]";
	}
	
	
	public static void main(String[] args) { //caractere du perso de la classe
		Gaulois asterix;
		asterix = new Gaulois("asterix",4);
		System.out.println(asterix);
		
		asterix.parler(" bonjour ");
		
		Romain felix = new Romain("felix", 4);
		asterix.frapper(felix );
		
	}

	
}






 








	
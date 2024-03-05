package personnages;

public class Village {
	private String nom;
	private Chef chef;//cgef est un gaulois
	private int nbVillageois = 0;
	
	private Gaulois[] tabvil;

	
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.tabvil = new Gaulois [nbVillageoisMaximum];//nouveau tableau avec des gaulois (pour chaque neauvau gaulis on fait un neau avec les atribut duconstructeur)
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
		}

	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) { //car gaulois est deja caracteriser deja par nom et force
		tabvil[nbVillageois]=gaulois;
		nbVillageois ++;
	}
	
	public Gaulois trouverHabitant(int numero) {
		return tabvil[numero];		
	}
	
	public void afficherVillageois() {
        System.out.println("Dans le village du chef " + chef.getNom() + " vivent les légendaires Gaulois :");
        for (int i = 0; i < nbVillageois; i++) {
            System.out.println("- " + tabvil[i].getNom());
        }
    }
	
	
	public static void main(String[] args) { 
		Village village = new Village ("Village des Irréductibles", 30);
		Gaulois asterix = new Gaulois("asterix",8);
		Gaulois obelix = new Gaulois("Obelix", 10);
		
		village.ajouterHabitant(asterix);
		village.ajouterHabitant(obelix);
		
		Chef abraracourcix = new Chef("abraracourcix",6,village);
		village.setChef(abraracourcix);
		
		
		Gaulois gaulois  = village.trouverHabitant(0);
		System.out.println(gaulois);
		
		village.afficherVillageois();
		
				
	}

	
	
	
}

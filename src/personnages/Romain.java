package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "  " + texte + " ");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aie");
		} else {
			parler("J'abandonne...");
		}
	}
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
			case 0:
			case 1:
				if (equipements[0] == equipement) {
					System.out.println("Le soldat " + nom + " possede deja " + equipement);
				} else {
					equipements[nbEquipement] = equipement;
					nbEquipement++;
					System.out.println("Le soldat " + nom + " s'equipe avec un " + equipement);
				}
				break;
			case 2:
				System.out.println("Le soldat " + nom + " est deja bien proteger !");
				break;
		}
	}
	
	public static void main(String[] args) {
		Romain romain = new Romain("Romain", -6);
		System.out.println(romain.getNom());
		
		romain.parler("Salut tout le monde");
		
		romain.recevoirCoup(5);
		
		// Test de l'énumération Equipement
		System.out.println(Equipement.Casque);
		System.out.println(Equipement.Bouclier);
		
		// Test de la méthode sEquiper
		romain.sEquiper(Equipement.Casque);
		romain.sEquiper(Equipement.Casque);
		romain.sEquiper(Equipement.Bouclier);
		romain.sEquiper(Equipement.Casque);
	}
}


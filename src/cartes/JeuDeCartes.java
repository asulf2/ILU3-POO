package cartes;

public class JeuDeCartes {
	private Configuration[] typesDeCartes = {
            new Configuration(new Borne(25), 10),
            new Configuration(new Borne(50), 10),
            new Configuration(new Borne(75), 10),
            new Configuration(new Borne(100), 12),
            new Configuration(new Borne(200), 4),
            new Configuration(new Parade(Type.FEU), 14),
            new Configuration(new Parade(Type.ESSENCE), 6),
            new Configuration(new Parade(Type.CREVAISON), 6),
            new Configuration(new Parade(Type.ACCIDENT), 6),
            new Configuration(new Attaque(Type.FEU), 5),
            new Configuration(new Attaque(Type.ESSENCE), 4),
            new Configuration(new Attaque(Type.CREVAISON), 3),
            new Configuration(new Attaque(Type.ACCIDENT), 3),
            new Configuration(new Botte(Type.FEU), 1),
            new Configuration(new Botte(Type.ESSENCE), 1),
            new Configuration(new Botte(Type.CREVAISON), 1),
            new Configuration(new Botte(Type.ACCIDENT), 1),
            new Configuration(new DebutLimite(), 4),
            new Configuration(new FinLimite(), 6)
        };

	
	public String affichageJeuDeCartes(Configuration[] typesDeCartes) {
	    StringBuilder sb = new StringBuilder();   
	    for (int i= 0; i<19;i++) {
	    	sb.append(typesDeCartes[i]);
	    	}
	    return sb.toString();
	    }

	
	
	private static class Configuration{
		private int nbExemplaire;
		private Carte carte;
		
		public Configuration( Carte carte, int nbExemplaire) {
			this.nbExemplaire = nbExemplaire;
            this.carte = carte;
		}
		
        public Carte getCarte() {
            return carte;
        }
		
        public int getNbExemplaire() {
            return nbExemplaire;
        }
        
	}
	
	public static void main(string[] args) {
		JeuDeCartes jeu = new JeuDeCartes();
		System.out.println(jeu.affichageJeuDeCartes());
		
		
	}

}

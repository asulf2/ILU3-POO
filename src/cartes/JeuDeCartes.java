package cartes;

public class JeuDeCartes {
	private Configuration[] typesDeCartes = new Configuration[19];

	public JeuDeCartes() {
					
	}
	
	
	private static class Configuration{
		private int nbExemplaire;
		private Carte carte;
		
		public Configuration(int nbExemplaire, Carte carte) {
			this.nbExemplaire = nbExemplaire;
            this.carte = carte;;
		}
		
        public Carte getCarte() {
            return carte;
        }
		
        public int getNbExemplaire() {
            return nbExemplaire;
        }
        
	}

}

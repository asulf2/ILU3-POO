package cartes;

public enum Type {
	FEU("Feu rouge","Feu vert","Prioritaire" ),
	ESSENCE("Panne d'essence ","Essence","Citerne"),
	CREVAISON("Crevaison","Roue de secours","increuvable"),
	ACCIDENT("Accident","Reparation","As du volant");
	
    private final String  attaque;
    private final String  defense;
    private final String  botte;
    
	private Type(String attaque, String defense, String botte) {
		this.attaque = attaque;
		this.defense = defense;
		this.botte = botte;
	}
	
    public String getAttaque() {
        return attaque;
    }
    
    public String getDefense() {
        return defense;
    }

	public String getBotte() {
		return botte;
	}
    
    
    

}

package cartes;

public class attaque extends Bataille {

	public attaque(Type type) {
		super(type);
		
	}
	
	@Override
	public String toString() {
        return "Attaque : " + this.getType().getAttaque();
    }

}

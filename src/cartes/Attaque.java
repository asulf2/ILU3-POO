package cartes;

public class Attaque extends Bataille {

	public Attaque(Type type) {
		super(type);
		
	}
	
	@Override
	public String toString() {
        return "Attaque : " + this.getType().getAttaque();
    }

}

package cartes;

public abstract class Probleme extends Carte {
	private Type type;

	public Probleme() {
		// TODO Auto-generated constructor stub
	}

	protected Probleme(Type type) {
		super();
		this.type = type;
	}
	public Type getType() {
        return type;
    }
	

}

package slimani_tarabay.rogue_like;
/**
 * Cette enum est pour decrire les differents types d'obstacles et decors sur la map
 * @author marianetarabay
 *
 */
public enum DecorMap {
	/**
	 * Decor reprentant la bordure
	 */
	BORDURE("G"),
	/**
	 * Decor reprentant la sortie
	 */
	SOL(" "),
	/**
	 * Decor reprentant la sortie
	 */
	SORTIE("0"),
	/**
	 * Decor reprentant le mur
	 */
	MUR("#");
	
	private String type;
	/**
	 * Constructeur de l'enum
	 * @param type String
	 */
	private DecorMap(String type) {
		this.type = type;
	}
	/**
	 * Pour l'afficher en forme de String
	 */
	@Override
	public String toString() {
		return this.type;
	}
}

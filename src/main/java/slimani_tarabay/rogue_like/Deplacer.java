package slimani_tarabay.rogue_like;


/**
 * Cette enum est pour decrire les sens dans lequelles le joueur peut se deplacer
 * @author marianetarabay
 *
 */
public enum Deplacer {
	/**
	 * Type pour decrire le deplacement vers le haut
	 */
	HAUT("deplacer haut")  {
		@Override
		public void moveOnMap(Map m) {
			try {
				m.movePlayer(0,1);
			} catch (NoMoveException e) {
				
				System.out.println(e);
			}
		}
	},
	/**
	 * Type pour decrire le deplacement vers le bas
	 */
	BAS("deplacer bas")  {
		@Override
		public void moveOnMap(Map m) {
			try {
				m.movePlayer(0,-1);
			} catch (NoMoveException e) {
				System.out.println(e);
			}
		}
	},
	/**
	 * Type pour decrire le deplacement vers la droite
	 */
	DROITE("deplacer droite") {
		@Override
		public void moveOnMap(Map m) {
			try {
				m.movePlayer(1,0);
			} catch (NoMoveException e) {
				System.out.println(e);
			}
		}
	},
	/**
	 * Type pour decrire le deplacement vers la gauche
	 */
	GAUCHE("deplacer gauche")  {
		@Override
		public void moveOnMap(Map m) {
			try {
				m.movePlayer(-1,0);
			} catch (NoMoveException e) {
				System.out.println(e);
			}
		}
	};

	private String sens;
	/**
	 * Constructeur de l'enum deplacer
	 * @param s
	 */
	Deplacer (String s) {
		sens = s;
	}
	/**
	 * Fonction qui retourne en String le sens
	 * @return String
	 */
	public String getSens() {
		return sens;
	}
	/**
	 * Fonction abstraite pour pouvoir donner a la classe Map le sens dans lequel le joueur doit se deplacer
	 * @param m Type Map
	 */
	public abstract void moveOnMap(Map m);
}


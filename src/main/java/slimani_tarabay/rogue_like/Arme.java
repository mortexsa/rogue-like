package slimani_tarabay.rogue_like;
/**
 * Cette enum est pour decrire les differents types d'armes
 * @author marianetarabay
 *
 */
public enum Arme {
	/**
	 * Type d'arme Baton
	 */
	BATON("|") {
		@Override
		public int perdPoints() {
			return 1;
		}
	/**
	 * Type d'arme Epais
	 */
	},EPAIS("!") {
		@Override
		public int perdPoints() {
			return 2;
		}
	/**
	 * Type d'arme Hache
	 */
	},HACHE("?") {
		@Override
		public int perdPoints() {
			return 3;
		}
	
	
	};
		String arme;
		
	private Arme(String s)
	{
	arme=s;
	
	}
	/**
	 * Fonction pour recuperer l'arme
	 * @return type String
	 */
	public String getArme() {
		return this.arme;
	}
	/**
	 * Cetter fonction est pour decrire chaque arme combien de points elle fait perdre
	 * @return le nombre de points que le dragon perd
	 */
	public abstract int perdPoints();
	@Override
	public String toString() {
		return this.arme;
	}

}

package slimani_tarabay.rogue_like;
/**
 * La classe Dragon herite la classe Personnage
 * @author marianetarabay
 *
 */
public class Dragon extends Personnage{
	/**
	 * Constructeur de la classe dragon
	 * @param coordonneesX coordonnee x de type int
	 * @param coordonneesY coordonnee y de type int
	 * @param apparence String
	 * @param pointDeVie int
	 */
	public Dragon(int coordonneesX, int coordonneesY, String apparence, int pointDeVie) {
		super(coordonneesX, coordonneesY, apparence, pointDeVie);
	}
	/**
	 * Pour que le dragon tape le joueur
	 * @param p de type Personnage
	 */
	public void taper(Personnage p) {
			int pv = p.getPointDeVie()-1;
			p.setPointDeVie(pv);
	}
}

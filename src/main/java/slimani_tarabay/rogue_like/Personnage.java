package slimani_tarabay.rogue_like;

import javax.swing.plaf.metal.OceanTheme;

public abstract class Personnage {
	
	private int coordonneesX;
	private int coordonneesY;
	private int pointDeVie;
	private String apparence;
	/**
	 * Constructeur de la classe abstraite Personnage
	 * @param coordonneesX : x position du joueur
	 * @param coordonneesY: y position du joueur
	 * @param apparence String pour decrire comment va apparaitre le personnage
	 * @param pointDeVie Point de Vie de chaque personnage, lorseque les points de vie sont a ) le personnage meurt
	 */
	public Personnage(int coordonneesX,int coordonneesY, String apparence,int pointDeVie) {
		this.coordonneesX = coordonneesX;
		this.coordonneesY = coordonneesY;
		this.pointDeVie = pointDeVie;
		this.apparence = apparence;
	}
	/**
	 * Fonction pour inserer la coordonnees X du personnage
	 * @param coordonneesX Pour inserer coordonnee X du Personnage
	 */
	public void setCoordonneesX(int coordonneesX) {
		this.coordonneesX = coordonneesX;
	}
	/**
	 * Fonction pour inserer la coordonnee Y du personnage
	 * @param coordonneesY Pour inserer coordonnee Y du Personnage
	 */
	public void setCoordonneesY(int coordonneesY) {
		this.coordonneesY= coordonneesY;
	}
	/**
	 * Fonction pour inserer le nb de points de vie du personnage
	 * @param pointDeVie Pour inserer le nombre de point de vie que le personnage possede
	 */
	public void setPointDeVie(int pointDeVie) {
		this.pointDeVie = pointDeVie;
	}
	/**
	 * Retourn la coordonneeX
	 * @return un type int
	 */
	public int getCoordonneesX() {
		return coordonneesX;
	}
	/**
	 * Retourn la coordonnee Y
	 * @return un type int
	 */
	public int getCoordonneesY() {
		return coordonneesY;
	}
	/**
	 * Fonction pour recuperer les points de Vie
	 * @return type int
	 */
	public int getPointDeVie() {
		return pointDeVie;
	}
	/**
	 * Fonction pour recupperer l'apparence
	 * @return type String
	 */
	public String getApparence() {
		return apparence;
	}
	/**
	 * Fonction pour inserer l'apparence
	 * @param apparence type String
	 */
	public void setApparence(String apparence) {
		this.apparence = apparence;
	}

	@Override
	public String toString() {
		return this.apparence;
	}
	/** 
	 * Fonction qui permet au personnage de taper un autre personnage , soit les dragons soit les joueurs
	 * @param p qui est le personnage, soit dragons soit joueur
	 * @param a est l'arme qu'il va utiliser
	 * @throws TaperInterdit Cette exception est declancher lorsque le personnage est trop loin pour etre taper
	 */
	public void taper(Personnage p,Arme a) throws TaperInterdit
	{	
		int pv = p.getPointDeVie()-a.perdPoints();

	}
	/**
	 * Cette fonction est pour changer les parametres du personnage lorsqu'il se deplace
	 * @param a dans le sens de x
	 * @param b dans le sens de y
	 */
	public void move(int a,int b)
	{
		setCoordonneesX(getCoordonneesX()+a);
		setCoordonneesY(getCoordonneesY()+b);
		
	}
}

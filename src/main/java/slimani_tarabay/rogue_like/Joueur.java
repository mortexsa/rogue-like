package slimani_tarabay.rogue_like;
/**
 *Le joueur herite la classe personnage et possede des variables et des methodes en plus
 * @author marianetarabay
 *
 */
public class Joueur extends Personnage{
	/**
	 * Les points de maagie representent le nombre de fois que peut taper le joueur
	 */
	private int pointDeMagie;
	/**
	 * Arme represente l'arme que le joueur possede
	 */
	private Arme arme=Arme.BATON;
	public Joueur(int coordonneesX, int coordonneesY, String apparence, int pointDeVie, int pointDeMagie) {
		super(coordonneesX, coordonneesY, apparence, pointDeVie);
		this.pointDeMagie = pointDeMagie;
	}

	public void setPointDeMagie(int pointDeMagie) {
		this.pointDeMagie = pointDeMagie;
	}
	public void move(int a,int b)
	{
		setCoordonneesX(getCoordonneesX()+a);
		setCoordonneesY(getCoordonneesY()+b);
		
	}
	@Override
	public void taper(Personnage p,Arme a) throws TaperInterdit
	{
		p.setPointDeVie(p.getPointDeVie()-a.perdPoints());
		this.pointDeMagie=this.pointDeMagie-1;
		
	}

	public Arme getArme() {
		return arme;
	}

	public void setArme(Arme arme) {
		this.arme = arme;
	}

	public int getPointDeMagie() {
		return pointDeMagie;
	}
	

}

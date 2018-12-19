package slimani_tarabay.rogue_like;

import java.util.ArrayList;
import java.util.EnumSet;
/**
 * La classe Map contient la carte du jeu et les details sur la carte, elle contient comme elements la hauteur de la carte,sa largeur
 * nbrMur nombre maximal de mur crees,nb le nombre de mur en effet crees, le niveau du joueur,le joueur et la liste de dragons crees et l'arme cree aleatoriement)
 * @author marianetarabay
 *
 */
public class Map {
	/**
	 * Hauteur de la matrice
	 */
	private int hauteur = 10;
	/**
	 * Largeur de la matrice
	 */
	private int largeur = 20;
	/**
	 * Nombre de murs maximal qu'il peut y avoir
	 */
	private int nbrMur = (hauteur*largeur)/9;
	/**
	 * Nombre de monstres
	 */
	public static final int nbrMonstre = 3;
	/**
	 * Nombre de murs qu'il y a
	 */
	private int nb=0;
	/**
	 * Level du joueur
	 */
	public static int level = 1;
	private Object[][] carte;
	private Joueur joueur;
	private ArrayList<Dragon> dragon;
	private Arme arme;
	public Arme getArme() {
		return arme;
	}

	public void setArme(Arme arme) {
		this.arme = arme;
	}
	/**
	 * Ce constructeur est appele lorsque le joueur commence un nouveau jeu
	 */
	public Map() {
		carte = new Object[hauteur][largeur];
		this.joueur=new Joueur((int)((Math.random()*(largeur-2))+1),(int)((Math.random()*(hauteur-2))+1),"@",20, 20);
		this.dragon = new ArrayList<Dragon>(); 
	}
	/**
	 * 
	 * @param h: hauteur du jeu
	 * @param l largeur du jeu
	 * @param le level du joueur
	 * @param j joueur
	 * @param d liste des dragons
	 * @param a arme qui est sur la carte
	 * 
	 */
	public Map(int h,int l,int le,Joueur j,ArrayList<Dragon> d,Arme a) {
		this.hauteur=h;
		this.largeur=l;
		this.level=le;
		this.setArme(a);
	
		this.nbrMur=(hauteur*largeur)/9;
		carte = new Object[hauteur][largeur];
		this.joueur=j;
		this.dragon = d; 
	}
	/**
	 * l'init carte est pour mettre les valeurs dans une carte nouvellement cree. Les murs,l'arme et les dragons sont choisi aleatoirement
	 */
	public void initCarte() {
		int x,y;
		int randomX,randomY;
		for(y=0;y<hauteur;y++) {
			for(x=0;x<largeur;x++) {
				if(y== 0 || y == hauteur-1 || x == 0 || x == largeur-1)
					this.carte[y][x] = DecorMap.BORDURE;
				else
					this.carte[y][x] = DecorMap.SOL;
			}	
		}	
		
		for(y=0;y<nbrMur;y++) {
			this.carte[(int)((Math.random()*(hauteur-2))+1)][(int)((Math.random()*(largeur-2))+1)] = DecorMap.MUR;
		}
		for(y=0;y<hauteur;y++) {
			for(x=0;x<largeur;x++) {
				if(this.carte[y][x]==DecorMap.MUR)
					this.nb++;
			}	
		}	
		do {
			randomY = (int)((Math.random()*(hauteur-2))+1);
			randomX = (int)((Math.random()*(largeur-2))+1);
		}while(this.carte[randomY][randomX] != DecorMap.SOL);
		carte[this.joueur.getCoordonneesY()][this.joueur.getCoordonneesX()]=this.joueur;
		
		do {
			randomY = (int)((Math.random()*(hauteur-2))+1);
			randomX = (int)((Math.random()*(largeur-2))+1);
		}while(this.carte[randomY][randomX] != DecorMap.SOL);
		this.carte[randomY][randomX] = DecorMap.SORTIE;



		
		for(y=0;y<level+nbrMonstre;y++) {
			do {
				randomY = (int)((Math.random()*(hauteur-2))+1);
				randomX = (int)((Math.random()*(largeur-2))+1);
			}while(this.carte[randomY][randomX] != DecorMap.SOL);
			Dragon d = new Dragon(randomX, randomY, "D", 2);
			dragon.add(d);
			this.carte[randomY][randomX] = d;
		}

		int a=(int) (Math.random()*3+1);
		
		do {
			randomY = (int)((Math.random()*(hauteur-2))+1);
			randomX = (int)((Math.random()*(largeur-2))+1);
				
		}while(this.carte[randomY][randomX] != DecorMap.SOL);
		if(a==1)
		{
			this.carte[randomY][randomX] = Arme.BATON;
			this.arme = Arme.BATON;
		}
		if(a==2) {
			this.carte[randomY][randomX] = Arme.EPAIS;
			this.arme = Arme.EPAIS;
		}
		if(a==3) {
			this.carte[randomY][randomX] = Arme.HACHE;
			this.arme = Arme.HACHE;
		}

	}
	public int getNb() {
		return nb;
	}

	public void setNb(int nb) {
		this.nb = nb;
	}
	/**
	 * Cette methode est pour remettre la carte telle qu'elle etait avant la sauvegarde
	 * @param xa represente l'abscisse de l'arme cree aleatoirement
	 * @param ya represente l'ordonnee de l'arme cree aleatoirement
	 * @param xs represente l'abscisse de la sortie cree aleatoirement
	 * @param ys  represente l'ordonnee de la sortie cree aleatoirement
	 * @param n represente le nombre de dragons cree
	 * @param murs represente les coordonnees des murs a remettre
	 */
	public void remettreCarte(int xa,int ya,int xs,int ys,int n,String[][] murs) {
		int x,y;
		int randomX,randomY;
		this.nb=n;
		for(y=0;y<hauteur;y++) {
			for(x=0;x<largeur;x++) {
				if(y== 0 || y == hauteur-1 || x == 0 || x == largeur-1)
					this.carte[y][x] = DecorMap.BORDURE;
				else
					this.carte[y][x] = DecorMap.SOL;
			}	
		}	
		
		for(y=0;y<hauteur;y++) {
			for(x=0;x<largeur;x++) {
				if(murs[y][x]=="#")
					this.carte[y][x] = DecorMap.MUR;
				
			}	
		}	
		
		carte[this.joueur.getCoordonneesY()][this.joueur.getCoordonneesX()]=this.joueur;
		
		
		for(y=0;y<level+nbrMonstre;y++) {
			int yd,xd;
			do {
				yd=dragon.get(y).getCoordonneesY();
				xd=dragon.get(y).getCoordonneesX();
			}while(this.carte[yd][xd] != DecorMap.SOL);
			if(dragon.get(y).getPointDeVie() > 0)
				this.carte[yd][xd] = dragon.get(y);
		}
		if(ya != -1 && xa != -1)
			this.carte[ya][xa] = this.arme;
		this.carte[ys][xs] = DecorMap.SORTIE;
	}
	@Override
	public String toString() {
		int y,x;
		String map="";
		for(y=(hauteur-1);y>=0;y--) {
			map += "\n";
			for(x=0;x<largeur;x++) {
				map += this.carte[y][x];
			}
		}
		map += "\n";
		return map;
	}
	/**
	 * Pour recuperer le niveau
	 * @return type int
	 */
	public int getLevel() {
		return level;
	}
	/**
	 * Pour mettre le niveau
	 * @param level type int
	 */
	public void setLevel(int level) {
		Map.level = level;
	}
	/**
	 * Pour recuperer la hauteur
	 * @return type int
	 */
	public int getHauteur() {
		return hauteur;
	}
	/**
	 * Pour recuperer la largeur
	 * @return type int
	 */
	public int getLargeur() {
		return largeur;
	}
	/**
	 * Pour recuperer le nombre de murs
	 * @return type int
	 */
	public int getNbrmur() {
		return nbrMur;
	}
	/**
	 * Cette fonction est pour controler le mouvement du joueur ou des dragons
	 * @param x de combien il doit augmenter en abscisse
	 * @param y de combien il doit augmenter en ordonnee
	 * @throws NoMoveException Cette exception est declancher lorsque le joueur va vers un mur
	 */
	public void movePlayer(int x,int y) throws NoMoveException
	{
		int i,randomDirection;
		if(carte[this.joueur.getCoordonneesY()+y][this.joueur.getCoordonneesX()+x] == DecorMap.SORTIE) {
			randomDirection = 0;
			for(i=0;i<dragon.size();i++) {
				if(dragon.get(i).getPointDeVie() > 0)
					randomDirection++;
			}
			if(randomDirection==0) {
				this.dragon.clear();
				level = level+1;
				if(Saisie.levelFinal != level)
					this.initCarte();
			}
		}else if(carte[this.joueur.getCoordonneesY()+y][this.joueur.getCoordonneesX()+x] == DecorMap.SOL){
			carte[this.joueur.getCoordonneesY()][this.joueur.getCoordonneesX()] = DecorMap.SOL;
			this.joueur.move(x, y);	
			carte[this.joueur.getCoordonneesY()][this.joueur.getCoordonneesX()]=this.joueur;
			for(i=0; i<dragon.size();i++) {
				if(this.dragon.get(i).getPointDeVie() > 0) {
					if(carte[this.dragon.get(i).getCoordonneesY()][this.dragon.get(i).getCoordonneesX()+1] == this.joueur ||
					   carte[this.dragon.get(i).getCoordonneesY()][this.dragon.get(i).getCoordonneesX()-1] == this.joueur ||
					   carte[this.dragon.get(i).getCoordonneesY()+1][this.dragon.get(i).getCoordonneesX()] == this.joueur ||
					   carte[this.dragon.get(i).getCoordonneesY()-1][this.dragon.get(i).getCoordonneesX()] == this.joueur) {
						this.dragon.get(i).taper(this.joueur);
						if(this.joueur.getPointDeVie() == 0) {
							Saisie.echecPartie = 1;
						}
					}else {
						randomDirection = (int)((Math.random()*4)%4)+1;
						carte[this.dragon.get(i).getCoordonneesY()][this.dragon.get(i).getCoordonneesX()] = DecorMap.SOL;
						if(randomDirection == 1) {
							if(carte[this.dragon.get(i).getCoordonneesY()][this.dragon.get(i).getCoordonneesX()+1] == DecorMap.SOL)
								this.dragon.get(i).move(1,0);
						}else if(randomDirection == 2) {
							if(carte[this.dragon.get(i).getCoordonneesY()+1][this.dragon.get(i).getCoordonneesX()] == DecorMap.SOL)
								this.dragon.get(i).move(0,1);
						}else if(randomDirection == 3) {
							if(carte[this.dragon.get(i).getCoordonneesY()-1][this.dragon.get(i).getCoordonneesX()] == DecorMap.SOL)
								this.dragon.get(i).move(0,-1);
						}else if(randomDirection == 4) {
							if(carte[this.dragon.get(i).getCoordonneesY()][this.dragon.get(i).getCoordonneesX()-1] == DecorMap.SOL)
								this.dragon.get(i).move(-1,0);
						}	
					}
					carte[this.dragon.get(i).getCoordonneesY()][this.dragon.get(i).getCoordonneesX()]=dragon.get(i);
				}
			}
		}else {
			throw new NoMoveException();
		}
		
	}
	/**
	 * Pour recuperer x du joueur
	 * @return type int
	 */
	public int coordxJ()
	{
		return this.joueur.getCoordonneesX();
	}
	/**
	 * Pour recuperer y du joueur
	 * @return type int
	 */
	public int coordyJ()
	{
		return this.joueur.getCoordonneesY();
	}
	/**
	 * Pour recuperer le joueur
	 * @return type joueur
	 */
	public Joueur getJoueur()
	{
		return this.joueur;
	}
	/**
	 * Pour recuperer le Dragon a un index donne
	 * @param i type int
	 * @return type Dragon
	 */
	public Dragon getDragon(int i)
	{
		return this.dragon.get(i);
	}
	/**
	 *  Pour recuperer la carte
	 * @return type Objet
	 */
	public Object[][] getCarte() {
		return carte;
	}
	/**
	 * Pour recuperer la liste de dragons
	 * @return type ArrayList
	 */
	public ArrayList<Dragon> getDragon() {
		return dragon;
	}
	/**
	 * Pour inserer liste de dragon
	 * @param dragon type ArrayList
	 */
	public void setDragon(ArrayList<Dragon> dragon) {
		this.dragon = dragon;
	}
	/**
	 * Pour inserer la carte
	 * @param carte type Objet[][]
	 */
	public void setCarte(Object[][] carte) {
		this.carte = carte;
	}
}

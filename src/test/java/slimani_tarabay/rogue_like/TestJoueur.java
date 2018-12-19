package slimani_tarabay.rogue_like;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestJoueur extends TestCase{
	public void testConstructeur() {
		Joueur joueur = new Joueur(1, 3, "@", 20, 18);
		assertNotNull(joueur);
	}
	
	public void testJoueur() {
		Joueur joueur = new Joueur(1, 3, "@", 20, 18);
		assertEquals(1, joueur.getCoordonneesX());
	}
	public void testJoueur2() {
		Joueur joueur = new Joueur(1, 3, "@", 20, 18);
		assertEquals(3, joueur.getCoordonneesY());
	}
	public void testJoueur3() {
		Joueur joueur = new Joueur(1, 3, "@", 20, 18);
		assertEquals("@", joueur.getApparence());
	}
	public void testJoueur4() {
		Joueur joueur = new Joueur(1, 3, "@", 20, 18);
		assertEquals(20, joueur.getPointDeVie());
	}
	public void testJoueur5() {
		Joueur joueur = new Joueur(1, 3, "@", 20, 18);
		assertEquals(18, joueur.getPointDeMagie());
	}
	public void testJoueur6() {
		Joueur joueur = new Joueur(1, 3, "@", 20, 18);
		assertEquals(Arme.BATON, joueur.getArme());
	}
	
	public void testSetJoueur() {
		Joueur joueur = new Joueur(1, 3, "@", 20, 18);
		joueur.setCoordonneesX(5);
		assertEquals(5, joueur.getCoordonneesX());
	}
	public void testSetJoueur2() {
		Joueur joueur = new Joueur(1, 3, "@", 20, 18);
		joueur.setCoordonneesY(5);
		assertEquals(5, joueur.getCoordonneesY());
	}
	public void testSetJoueur3() {
		Joueur joueur = new Joueur(1, 3, "@", 20, 18);
		joueur.setApparence("P");
		assertEquals("P", joueur.getApparence());
	}
	public void testSetJoueur4() {
		Joueur joueur = new Joueur(1, 3, "@", 20, 18);
		joueur.setPointDeVie(50);
		assertEquals(50, joueur.getPointDeVie());
	}
	public void testSetJoueur5() {
		Joueur joueur = new Joueur(1, 3, "@", 20, 18);
		joueur.setPointDeMagie(30);
		assertEquals(30, joueur.getPointDeMagie());
	}
	public void testSetJoueur6() {
		Joueur joueur = new Joueur(1, 3, "@", 20, 18);
		joueur.setArme(Arme.EPAIS);;
		assertEquals(Arme.EPAIS, joueur.getArme());
	}
	public void testSetJoueur7() {
		Joueur joueur = new Joueur(1, 3, "@", 20, 18);
		joueur.setArme(Arme.HACHE);;
		assertEquals(Arme.HACHE, joueur.getArme());
	}
	public void testSetJoueur8() {
		Joueur joueur = new Joueur(1, 3, "@", 20, 18);
		joueur.setArme(Arme.BATON);;
		assertEquals(Arme.BATON, joueur.getArme());
	}
	
	public void testTaper() {
		Dragon dragon = new Dragon(1, 3, "D", 2);
		Joueur joueur = new Joueur(2, 3, "@", 20, 18);
		try {
			joueur.setArme(Arme.BATON);
			joueur.taper(dragon, joueur.getArme());
			assertEquals(1, dragon.getPointDeVie());
		}catch (TaperInterdit e) {
			e.getMessage();
		}
	}
	public void testTaper2() {
		Dragon dragon = new Dragon(1, 3, "D", 2);
		Joueur joueur = new Joueur(2, 3, "@", 20, 18);
		try {
			joueur.setArme(Arme.EPAIS);
			joueur.taper(dragon, joueur.getArme());
			assertEquals(0, dragon.getPointDeVie());
		}catch (TaperInterdit e) {
			e.getMessage();
		}
	}
	public void testTaper3() {
		Dragon dragon = new Dragon(1, 3, "D", 2);
		Joueur joueur = new Joueur(2, 3, "@", 20, 18);
		try {
			joueur.setArme(Arme.HACHE);
			joueur.taper(dragon, joueur.getArme());
			assertEquals(-1, dragon.getPointDeVie());
		}catch (TaperInterdit e) {
			e.getMessage();
		}
	}
	public void testTaper4() {
		Dragon dragon = new Dragon(1, 3, "D", 2);
		Joueur joueur = new Joueur(2, 3, "@", 20, 18);
		try {
			joueur.setArme(Arme.HACHE);
			joueur.taper(dragon, joueur.getArme());
			assertEquals(17, joueur.getPointDeMagie());
		}catch (TaperInterdit e) {
			e.getMessage();
		}
	}
	
	public void testMove() {
		Joueur joueur = new Joueur(1, 3, "@", 20, 18);
		joueur.move(2, 4);
		assertEquals(3, joueur.getCoordonneesX());
	}
	public void testMove2() {
		Joueur joueur = new Joueur(1, 3, "@", 20, 18);
		joueur.move(2, 4);
		assertEquals(7, joueur.getCoordonneesY());
	}
}

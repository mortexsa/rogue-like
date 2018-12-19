package slimani_tarabay.rogue_like;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestDragon extends TestCase{
	public void testConstructeur() {
		Dragon dragon = new Dragon(1, 3, "D", 2);
		assertNotNull(dragon);
	}
	
	public void testDragon() {
		Dragon dragon = new Dragon(1, 3, "D", 2);
		assertEquals(1, dragon.getCoordonneesX());
	}
	public void testDragon2() {
		Dragon dragon = new Dragon(1, 3, "D", 2);
		assertEquals(3, dragon.getCoordonneesY());
	}
	public void testDragon3() {
		Dragon dragon = new Dragon(1, 3, "D", 2);
		assertEquals("D", dragon.getApparence());
	}
	public void testDragon4() {
		Dragon dragon = new Dragon(1, 3, "D", 2);
		assertEquals(2, dragon.getPointDeVie());
	}
	
	public void testSetDragon() {
		Dragon dragon = new Dragon(1, 3, "D", 2);
		dragon.setCoordonneesX(5);
		assertEquals(5, dragon.getCoordonneesX());
	}
	public void testSetDragon2() {
		Dragon dragon = new Dragon(1, 3, "D", 2);
		dragon.setCoordonneesY(5);
		assertEquals(5, dragon.getCoordonneesY());
	}
	public void testSetDragon3() {
		Dragon dragon = new Dragon(1, 3, "D", 2);
		dragon.setApparence("B");;
		assertEquals("B", dragon.getApparence());
	}
	public void testSetDragon4() {
		Dragon dragon = new Dragon(1, 3, "D", 2);
		dragon.setPointDeVie(10);;
		assertEquals(10, dragon.getPointDeVie());
	}
	
	public void testTaper() {
		Dragon dragon = new Dragon(1, 3, "D", 2);
		Joueur joueur = new Joueur(2, 3, "@", 20, 18);
		dragon.taper(joueur);
		assertEquals(19, joueur.getPointDeVie());
	}
	
	public void testMove() {
		Dragon dragon = new Dragon(1, 3, "D", 2);
		dragon.move(2, 4);
		assertEquals(3, dragon.getCoordonneesX());
	}
	public void testMove2() {
		Dragon dragon = new Dragon(1, 3, "D", 2);
		dragon.move(2, 4);
		assertEquals(7, dragon.getCoordonneesY());
	}
}

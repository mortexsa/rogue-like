package slimani_tarabay.rogue_like;

import junit.framework.TestCase;

public class TestDeplacer extends TestCase{
	public void testGetSens() {
		assertEquals("deplacer haut",Deplacer.HAUT.getSens());
	}
	public void testGetSens2() {
		assertEquals("deplacer bas",Deplacer.BAS.getSens());
	}
	public void testGetSens3() {
		assertEquals("deplacer droite",Deplacer.DROITE.getSens());
	}
	public void testGetSens4() {
		assertEquals("deplacer gauche",Deplacer.GAUCHE.getSens());
	}
}

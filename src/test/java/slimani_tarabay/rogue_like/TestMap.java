package slimani_tarabay.rogue_like;

import java.util.ArrayList;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestMap extends TestCase{
	public void testConstructeur() {
		Map map = new Map();
		assertNotNull(map);
	}
	public void testConstructeur2() {
		Map map = new Map(1,2,3,null,null,null);
		assertNotNull(map);
	}
	
	public void testMap() {
		Map map = new Map();
		assertEquals(10, map.getHauteur());
	}
	public void testMap2() {
		Map map = new Map();
		assertEquals(20, map.getLargeur());
	}
	public void testMap3() {
		Map map = new Map();
		assertEquals(22, map.getNbrmur());
	}
	public void testMap4() {
		Map map = new Map();
		assertEquals(22, map.getNbrmur());
	}
	public void testMap5() {
		Map map = new Map();
		assertEquals(3, map.nbrMonstre);
	}
	public void testMap6() {
		Map map = new Map();
		assertEquals(0, map.getNb());
	}
	public void testMap7() {
		Map map = new Map();
		assertEquals(1, map.level);
	}
	public void testMap8() {
		Map map = new Map();
		assertTrue(map.getCarte() instanceof Object);
	}
	public void testMap9() {
		Map map = new Map();
		assertTrue(map.getJoueur() instanceof Joueur);
	}
	public void testMap10() {
		Map map = new Map();
		assertEquals(0, map.getDragon().size());
	}
	public void testMap11() {
		Map map = new Map();
		map.setArme(Arme.BATON);
		assertTrue(map.getArme() == Arme.BATON);
	}
	public void testMap12() {
		Map map = new Map();
		Dragon dragon = new Dragon(1, 3, "D", 2);
		map.getDragon().add(dragon);
		assertEquals(1, map.getDragon().size());
	}
	public void testMap13() {
		Map map = new Map();
		assertEquals(0, map.getDragon().size());
	}
	
	public void testSetMap() {
		Map map = new Map();
		map.setNb(10);
		assertEquals(10, map.getNb());
	}
	public void testSetMap2() {
		Map map = new Map();
		map.level = 15;
		assertEquals(15, map.level);
	}
	public void testSetMap3() {
		Map map = new Map();
		map.setArme(Arme.EPAIS);
		assertEquals(Arme.EPAIS, map.getArme());
	}
}

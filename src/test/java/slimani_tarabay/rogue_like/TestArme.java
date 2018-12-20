package slimani_tarabay.rogue_like;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestArme extends TestCase{
	public void testToString() {
		assertEquals("|",Arme.BATON.toString());
	}
	public void testToString2() {
		assertEquals("!",Arme.EPAIS.toString());
	}
	public void testToString3() {
		assertEquals("?",Arme.HACHE.toString());
	}
	
	public void testPerdPoints() {
		assertEquals(1,Arme.BATON.perdPoints());
	}
	public void testPerdPoints2() {
		assertEquals(2,Arme.EPAIS.perdPoints());
	}
	public void testPerdPoints3() {
		assertEquals(3,Arme.HACHE.perdPoints());
	}
}

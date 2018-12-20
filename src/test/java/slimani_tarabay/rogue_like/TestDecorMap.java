package slimani_tarabay.rogue_like;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestDecorMap extends TestCase{
	public void testDecorMap() {
		assertEquals("G",DecorMap.BORDURE.toString());
	}
	public void testDecorMap2() {
		assertEquals("0",DecorMap.SORTIE.toString());
	}
	public void testDecorMap3() {
		assertEquals(" ",DecorMap.SOL.toString());
	}
	public void testDecorMap4() {
		assertEquals("#",DecorMap.MUR.toString());
	}
}

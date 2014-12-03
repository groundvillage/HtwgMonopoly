package de.htwg.se.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DiceResultTest {

	DiceResult diceResult1, diceResult2, diceResult3, diceResult4;
	
	@Before
	public void setUp()  {
		diceResult1 = new DiceResult(1, 6);
		diceResult2 = new DiceResult(1, 7);
		diceResult3 = new DiceResult(0, 6);
		diceResult4 = new DiceResult(0, 7);
	}
	
	@Test
	public void testGetDice1() {
		/*assertTrue(diceResult1.getDice1() == 1);
		assertTrue(diceResult2.getDice1() == 1);
		assertNull(diceResult3.getDice1());
		assertNull(diceResult4.getDice1());*/
	}
	
	@Test
	public void testGetDice2() {
		/*assertTrue(diceResult1.getDice2() == 1);
		assertTrue(diceResult2.getDice2() == 1);
		assertNull(diceResult3.getDice2());
		assertNull(diceResult4.getDice2());*/
	}
}

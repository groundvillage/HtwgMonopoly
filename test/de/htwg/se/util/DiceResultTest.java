package de.htwg.se.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DiceResultTest {

	private static final ExpectedException IllegalArgumentException = null;
	DiceResult diceResult1, diceResult2, diceResult3, diceResult4;
	
	@Before
	public void setUp()  {
		diceResult1 = new DiceResult(1, 6);
		/*diceResult2 = new DiceResult(1, 7);
		diceResult3 = new DiceResult(0, 6);
		diceResult4 = new DiceResult(0, 7);*/
	}
	
	@Rule
	public ExpectedException exception = IllegalArgumentException;
	
	@Test
	public void testKonstruktorDiceResult() {
		exception.expect(IllegalArgumentException.class);
		diceResult2 = new DiceResult(1,7);
	}
	
	@Test
	public void testGetDice1() {
		assertEquals(diceResult1.getDice1(), 1);
	}
	
	@Test
	public void testGetDice2() {
		assertEquals(diceResult1.getDice2(), 6);
	}
	
	
	
	
}

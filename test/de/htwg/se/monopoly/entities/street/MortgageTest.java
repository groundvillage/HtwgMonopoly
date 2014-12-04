package de.htwg.se.monopoly.entities.street;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import de.htwg.se.util.DiceResult;

public class MortgageTest {

	Mortgage mort1;
	
	@Before
	public void setUp()  {
		mort1 = new Mortgage(new BuildableStreet("Braunegger", 100));
	}
	
	@Test
	public void testGetMortgage() {
		assertEquals(mort1.getMortgage(), (int)(100 * 1.1));
	}
	
	@Test
	public void testGetActiveMortgage() {
		assertEquals(mort1.getActiveMortgage(), 0);
	}

}

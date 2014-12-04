package de.htwg.se.monopoly.entities.street;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class BuildableStreetTest {

	BuildableStreet bStreet;
	
	@Before
	public void setup() {
		bStreet = new BuildableStreet("Braunegger", 100);
	}

	@Test
	public void testGetHousingState() {
		assertEquals(bStreet.getHousingState(), 0);
	}
	
	@Test
	public void testKonstruktor() {
		assertEquals(bStreet.getName(), "Braunegger");
		assertEquals(bStreet.getPrice(), 100);
		assertEquals(bStreet.getHousingState(), 0);
	}
	
	@Test
	public void testUpgradeStreet() {
		assertTrue(bStreet.upgradeStreet());
		for (int i = 1; i < bStreet.HOUSINGSTATEMAX; i++) {
			bStreet.upgradeStreet();
		}
		assertFalse(bStreet.upgradeStreet());
	}

}

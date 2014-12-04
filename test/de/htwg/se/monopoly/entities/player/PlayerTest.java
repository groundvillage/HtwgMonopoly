package de.htwg.se.monopoly.entities.player;

import static org.junit.Assert.*;
import de.htwg.se.monopoly.entities.player.Player;

import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

	Player player;
	
	@Before
	public void setUp()  {
		player = new Player("Peter", 2000);
	}
	
	@Test
	public void testGetName() {
		assertEquals(player.getName(), "Peter");
	}
	
	@Test
	public void testGetAssets() {
		assertEquals(player.getAssets(), 2000);
	}
	
}

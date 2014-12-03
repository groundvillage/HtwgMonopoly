package test.java.de.htwg.se.monopoly.entities.player;

import static org.junit.Assert.*;
import main.java.de.htwg.se.monopoly.entities.player.Player;

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
		assertTrue(player.getName().equals("Peter"));
	}
	
	public void testGetDeposit() {
		assertTrue(player.getDeposit() == 2000);
	}
	
}

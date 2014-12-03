package de.htwg.se.monopoly.entities.player;

import static org.junit.Assert.*;
import de.htwg.se.monopoly.entities.player.Character;
import de.htwg.se.monopoly.entities.player.Player;

import org.junit.Before;
import org.junit.Test;

public class CharacterTest {
	Character character;
	
	@Before
	public void setUp()  {
		character = new Character();
	}
	
	@Test
	public void testGetName() {
		assertTrue(character.getField() == 0);
	}
}

package de.htwg.se.util;

import java.util.Random;

public class Dice {
	
	private static int MINDICEVALUE = 1;
	private static int MAXDICEVALUE = 6;
	
	Random rm;
	
	public Dice() {
		rm = new Random();
	}
	
	public DiceResult rollingDice() {
		DiceResult result;
		int value1 = rm.nextInt(MAXDICEVALUE - MINDICEVALUE) + MINDICEVALUE;
		int value2 = rm.nextInt(MAXDICEVALUE - MINDICEVALUE) + MINDICEVALUE;
		return result = new DiceResult(value1, value2);
	}

}

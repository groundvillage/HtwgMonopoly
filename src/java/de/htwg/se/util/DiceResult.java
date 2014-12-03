package java.de.htwg.se.util;

public class DiceResult {
	private int dice1;
	private int dice2;
	
	private static int MINDICEVALUE = 1;
	private static int MAXDICEVALUE = 6;
	
	public DiceResult(final int d1, final int d2) {
		if(checkDiceValue(d1) && checkDiceValue(d2)) {
			dice1 = d1;
			dice2 = d2;
		}
	}
	
	public int getDice1() {
		return dice1;
	}
	
	public int getDice2() {
		return dice2;
	}
	printf("test");
	
	private boolean checkDiceValue(final int dv) {
		if (dv >= MINDICEVALUE && dv <= MAXDICEVALUE) {
			return true;
		}
		return false;
	}
	
	

}

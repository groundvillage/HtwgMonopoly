package de.htwg.se.monopoly.entities.street;

public class Mortgage {
	
	private int mortgage;
	private int activMortgage;
	
	public Mortgage(final Street street) {
		mortgage = calcMortgage(street);
	}
	
	private int calcMortgage(final Street street) {
		return 0;
	}
}

package de.htwg.se.monopoly.entities.street;

public class Mortgage {
	
	private int mortgage;
	private int activeMortgage;
	
	private static double MORTGAGEFACTOR = 1.1;
	
	public Mortgage(final AbstractStreet street) {
		mortgage = calcMortgage(street);
		activeMortgage = 0;
	}
	
	private int calcMortgage(final AbstractStreet street) {
		int streetValue = (int) (street.getPrice() * MORTGAGEFACTOR);
		return streetValue;
	}
	
	public int getMortgage() {
		return mortgage;
	}
	
	public int getActiveMortgage() {
		return activeMortgage;
	}
}

package de.htwg.se.monopoly.entities.street;


public class BuildableStreet extends AbstractStreet {

	private int housingState;
	public static int HOUSINGSTATEMAX = 5;
	
	public BuildableStreet(final String name, final int price) {
		super(name, price);
		housingState = 0;
	}
	
	public int getHousingState() {
		return housingState;
	}
	
	public boolean upgradeStreet() {
		if (housingState < HOUSINGSTATEMAX) {
			housingState++;
			return true;
		}
		return false;
	}
}

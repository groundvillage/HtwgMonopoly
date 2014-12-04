package de.htwg.se.monopoly.entities.street;


public class BuildableStreet extends AbstractStreet {

	int housingState;
	
	public BuildableStreet(final String name, final int price) {
		super(name, price);
		housingState = 0;
	}
	
	public int getHousingState() {
		return housingState;
	}
}

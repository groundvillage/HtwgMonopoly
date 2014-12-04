package de.htwg.se.monopoly.entities.player;

public class Player {

	private String name;
	private int assets;
	
	
	public Player(final String name, final int assets) {
		this.name = name;
		this.assets = assets;
	}
	
	
	
	public String getName() {
		return name;
	}
	
	public int getAssets() {
		return assets;
	}
}

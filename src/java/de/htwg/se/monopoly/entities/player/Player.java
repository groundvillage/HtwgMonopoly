package main.java.de.htwg.se.monopoly.entities.player;

public class Player {

	private String name;
	private int deposit;
	
	
	public Player(final String name, final int deposit) {
		this.name = name;
		this.deposit = deposit;
	}
	
	
	
	public String getName() {
		return name;
	}
	
	public int getDeposit() {
		return deposit;
	}
}

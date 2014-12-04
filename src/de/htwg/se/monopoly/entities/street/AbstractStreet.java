package de.htwg.se.monopoly.entities.street;

public abstract class AbstractStreet implements Street{

	protected String name;
	protected int price;
	
	public AbstractStreet(final String name, final int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	
}

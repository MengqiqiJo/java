package com;

public class Fruits extends Food {
	private int sugar;
	public Fruits(String name, double price, double weight,int sugar) {
		super(name, price,weight);
		this.sugar=sugar;

	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public int getSugar() {
		return this.sugar;
	}

	public Fruits(String name, double price, double weight) {
		super(name, price,weight);
		

	}

	public Fruits(String name, double price) {
		super(name, price);
	}

	public Fruits() {
		super();

	}
	public int getFat() {
		return 0;
	}
	
	
	
	
}

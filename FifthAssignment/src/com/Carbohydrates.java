package com;

public class Carbohydrates extends Food {
	private int sugar;
	
	public Carbohydrates(String name, double price, double weight,int sugar) {
		super(name, price, weight);
		this.sugar = sugar;
	}
	
	public Carbohydrates(String name, double price, double weight) {
		super(name, price,weight);
	}

	public Carbohydrates(String name, double price) {
		super(name, price);
	}

	public Carbohydrates() {
		super();

	}
	public int getFat() {
		return 0;
	}
	
	public int getSugar() {
		return sugar;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

}

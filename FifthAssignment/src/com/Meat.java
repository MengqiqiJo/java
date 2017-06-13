package com;

public class Meat extends Food {
	private int fat;
	
	public Meat(String name, double price, double weight,int fat) {
		super(name, price,weight);
		
		this.fat=fat;
	}


	public Meat(String name, double price, double weight) {
		super(name, price,weight);
		
	}

	public Meat(String name, double price) {
		super(name, price);
	}

	public Meat() {
		super();

	}

	public int getFat() {
		return this.fat;
	}

	public int getSugar() {
		return 0;
	}
	public void setFat(int fat) {
		this.fat = fat;
	}

}

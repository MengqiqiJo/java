package com;

public abstract class Food {
	private String name;
	private double price;
	private double weight;
	
	public Food(){
		this.name="";
		this.price=0.0;
	}

	public Food(String name, double price) {
		this.name = name;
		this.price = price;

	}
	public Food(String name, double price,double weight) {
		this.name = name;
		this.price = price;
		this.weight=weight;

	}

	public abstract int getFat();
	public abstract int getSugar() ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getNewWeight(Food afood) {
		return this.weight - afood.getWeight();
	}

	public double getTotalPrice() {
		return (this.price * this.weight);
	}

	public double getTotalFat() {
		return (getFat() * this.weight);
	}

	public double getTotalSugar() {
		return (getSugar() * this.weight);
	}
	public String toString(){
		return this.name+" "+this.price+" "+this.weight;
	}

}

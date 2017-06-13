package com;

import java.util.Scanner;
import java.util.StringTokenizer;

public class GroceryInventroy {
	public static void main(String args[]) {

		Food inventory[] = new Food[4];
		inventory[0] = new Fruits("apple", 1.89, 500.0);
		inventory[1] = new Fruits("orange", 2.36, 600.0);
		inventory[2] = new Carbohydrates("rice", 2.3, 580.0);
		inventory[3] = new Meat("lamb", 10.5, 999.9);
		for (int i = 0; i < inventory.length; i++) {
			System.out.println(inventory[i].getName() + "'s "
					+ "inventory is : " + inventory[i].getWeight());
		}

		String inputPurchase[][] = new String[4][3];
		String name,  weight;
		for (int i = 0; i < 4; i++) {
			System.out.println("please enter the items you want to buy: ");
			Scanner inputPurchaseStr = new Scanner(System.in);
			String inputString = inputPurchaseStr.nextLine();
			StringTokenizer str = new StringTokenizer(inputString);
			name = str.nextToken();	
			weight = str.nextToken();
			inputPurchase[i][0] = name;	
			inputPurchase[i][1] = weight;
		}

		Food purchaseArray[] = new Food[4];
		
		purchaseArray[0] = new Fruits(inputPurchase[0][0],1.89,	Double.parseDouble(inputPurchase[0][1]),200);

		purchaseArray[1] = new Fruits(inputPurchase[1][0],2.36,Double.parseDouble(inputPurchase[1][1]),150);
	
		purchaseArray[2] = new Carbohydrates(inputPurchase[2][0],2.3,Double.parseDouble(inputPurchase[2][1]),600);
	
		purchaseArray[3] = new Meat(inputPurchase[3][0],10.5,Double.parseDouble(inputPurchase[3][1]),230);

		double totalPrice = 0.0;
		double totalFat = 0.0;
		double totalSugar = 0.0;
		for (Food f : purchaseArray) {
			totalPrice = totalPrice + f.getTotalPrice();
			totalFat = totalFat + f.getTotalFat();
			totalSugar = totalSugar + f.getTotalSugar();
		}
		System.out.println("total price  " + totalPrice);
		System.out.println("total fat  " + totalFat);
		System.out.println("total sugar  " + totalSugar);

	
		System.out.println(" after purchase store still have "
				+ inventory[0].getNewWeight(purchaseArray[0]) + " kg "
				+ inventory[0].getName());
		System.out.println("after purchase store still have "
				+ inventory[1].getNewWeight(purchaseArray[1]) + " dozen "
				+ inventory[1].getName());
		System.out.println(" after purchase store still have "
				+ inventory[2].getNewWeight(purchaseArray[2]) + " kg "
				+ inventory[2].getName());
		System.out.println(" after purchase store still have "
				+ inventory[3].getNewWeight(purchaseArray[3]) + " kg "
				+ inventory[3].getName());

	}
}

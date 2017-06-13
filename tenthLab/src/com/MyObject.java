package com;

public class MyObject {
	int avgNumbers[] = {0,0,0,0,0};
	int count = 0;

	public void insert(int a){
		try{
			avgNumbers[count] = a;
			count++;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("e: " + e);
		}

	}

	public double  calcAverage(){
		int sum = 0;
		double result = 0;
		for(int i = 0; i < count ; i++){
			sum += avgNumbers[i];
		}
		result = ((double) sum)/count;
		return result;
	}  

}

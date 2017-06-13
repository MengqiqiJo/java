package com;

import java.util.ArrayList;

public class MyInformationSystem<T> {
	
		private class Pair<T> {
		private String key;
		private T value;

		public Pair(String key, T value) {
			this.key = key;
			this.value = value;
		}

		public boolean keyMatches(String keyValue) {
			return key.equals(keyValue);
		}
	}

		private ArrayList<Pair<T>> myList;
			
	public MyInformationSystem(ArrayList<Pair<T>> myList) {
		this.myList = myList;
	}

	public MyInformationSystem() {
		this.myList = new ArrayList<Pair<T>>();
	}

	public void insert(T value, String key) {
		Pair<T> pair = new Pair<T>(key, value);
		myList.add(pair);
	}

	public T retrieve(String keyValue) throws Exception {
		if (myList == null || myList.size() == 0) {
			throw new Exception("MyInformationSystem is empty");
		}
		for (Pair<T> pair : myList) {
			if (pair.keyMatches(keyValue)) {
				return pair.value;
			}
		}
		throw new Exception("not found");
	}

	

	public static void main(String[] args) {
		String result;
		String keyList[] = { "126", "536", "428", "245" };
		MyInformationSystem<String> nameStudentNumberList;
		nameStudentNumberList = new MyInformationSystem<String>();
		nameStudentNumberList.insert("John", "245");// John has
		nameStudentNumberList.insert("Tom", "126");
		nameStudentNumberList.insert("Mary", "536");
		nameStudentNumberList.insert("Mark", "821");
		for(int i = 0; i < keyList.length; i++){
			try{
				result = nameStudentNumberList.retrieve(keyList[i]); System.out.println("For key " + keyList[i] +
						" the matching value is " + result);
			}catch(Exception e){
				System.out.println("No Match with " + keyList[i]);
			}
		}
	}
}

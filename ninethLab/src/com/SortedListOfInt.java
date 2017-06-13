package com;

public class SortedListOfInt {
	private ListGeneral myList = new ListGeneral();

	public void addElement(int x) {
		myList.restart();
		addInt(x);
		/*
		 * boolean positionToInsertNewElementNotFound = true; int currentValue;
		 * myList.restart(); while (positionToInsertNewElementNotFound){ if
		 * (myList.endOfList()){ positionToInsertNewElementNotFound = false; }
		 * else{ currentValue = (Integer) myList.currentValue(); if
		 * (currentValue >= x){ positionToInsertNewElementNotFound = false; }
		 * else { myList.getNextNode(); } } } myList.addBeforeCurrent(new
		 * Integer(x));
		 */
	}

	private void addInt(int x) {
		int currentValue;
		if (myList.endOfList()) {
			myList.addBeforeCurrent(new Integer(x));
		} else {
			currentValue = (Integer) (myList.currentValue());
			if (currentValue > x) {
				myList.addBeforeCurrent(new Integer(x));
			} else {
				myList.getNextNode();
				addInt(x);
			}
		}

	}

	public String retrieve(int lowerLimit, int upperLimit) {
		myList.restart();
		return ValuesInRange(lowerLimit, upperLimit);
	}

	public String ValuesInRange(int lowerLimit, int upperLimit) {
		int currentValue;
		if (!myList.endOfList()) {
			currentValue = (Integer) (myList.currentValue());
			if (currentValue < lowerLimit) {
				myList.getNextNode();
				return ValuesInRange(lowerLimit, upperLimit);
			} else if ((currentValue >= lowerLimit)
					&& (currentValue <= upperLimit)) {
				myList.getNextNode();
				return currentValue + "\n"
						+ ValuesInRange(lowerLimit, upperLimit);
			}
		}
		return "";

	}

	public int deleteElement(int x) {
		myList.restart();
		/*
		 * boolean positionToInsertNewElementNotFound = true; int currentValue;
		 * 
		 * while (positionToInsertNewElementNotFound){ if (!myList.endOfList()){
		 * currentValue = (Integer) (myList.currentValue()); if(currentValue ==
		 * x){ myList.removeCurrent(); }else { myList.getNextNode(); } }else{
		 * positionToInsertNewElementNotFound = false; } }
		 */
		deleteInt(x);
		return x;
	}

	public void deleteInt(int x) {
		int currentValue;

		if (!myList.endOfList()) {
			currentValue = (Integer) (myList.currentValue());
			if (currentValue == x) {
				myList.removeCurrent();
				deleteInt(x);
			} else if (currentValue < x) {
				myList.getNextNode();
				deleteInt(x);
			}
		}

	}
}

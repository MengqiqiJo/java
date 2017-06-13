package com;

public class ListGeneric<T> {
	private class InnerNode {
		private T value;
		private InnerNode next;

		public InnerNode(T value, InnerNode nextNode) {
			this.value = value;
			this.next = nextNode;
		}
	}

	protected InnerNode firstNode;

	private InnerNode currentNode, previousNode;

	public ListGeneric() {
		currentNode = null;
		firstNode = null;
		previousNode = null;
	}

	public void addAfterCurrent(T x) {
		if (firstNode == null) {
			firstNode = new InnerNode(x, null);
			currentNode = firstNode;
		} else {
			InnerNode newNode = new InnerNode(x, currentNode.next);
			currentNode.next = newNode;
			previousNode = currentNode;
			currentNode = newNode;
		}
	}

	public void addBeforeCurrent(T x) {
		if (firstNode == null) {
			firstNode = new InnerNode(x, null);
			currentNode = firstNode;
		} else {
			InnerNode newNode = new InnerNode(x, currentNode);
			if (previousNode != null) {
				previousNode.next = newNode;
			} else {
				firstNode = newNode;
			}
			currentNode = newNode;
		}
	}

	public void removeCurrent() {
		InnerNode temp;
		if (listIsEmpty() || endOfList())
			return;
		temp = currentNode.next;

		if (previousNode == null) {
			firstNode = temp;
		} else {
			previousNode.next = temp;
		}
		currentNode = currentNode.next;
	}

	public boolean listIsEmpty() {
		return firstNode == null;
	}

	public T currentValue() {
		return currentNode.value;
	}

	public void restart() {
		currentNode = firstNode;
		previousNode = null;
	}

	public boolean endOfList() {
		return currentNode == null;
	}

	public boolean getNextNode() {
		if (currentNode == null) {
			return false;
		} else {
			previousNode = currentNode;
			currentNode = currentNode.next;
			return true;
		}
	}

	public String toString() {
		String s = "";
		InnerNode listPtr;
		listPtr = firstNode;

		while (listPtr != null) {
			s += listPtr.value + "\n";
			listPtr = listPtr.next;
		}
		return s;
	}
}

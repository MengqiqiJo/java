package com;

public class SearchableList<T extends Searchable> {

	private ListGeneric<T> aList;

	public class SearchingIterator {
		Object keyToSearchFor;

		public SearchingIterator(Object key) {
			keyToSearchFor = key;
		}

		public T findFirstMatch() {
			aList.restart();
			return findMatch();
		}

		public T findMatch() {
			T currentValue;
			if (aList.endOfList()) {
				return null;
			} else {
				currentValue = aList.currentValue();
				if (currentValue.keyMatches(keyToSearchFor)) {
					return currentValue;
				} else {
					aList.getNextNode();
					return findMatch();
				}
			}
		}

		public T findNextMatch() {
			aList.getNextNode();
			return findMatch();
		}
	}

	public void insert(T x) {
		aList.restart();
		insertAfterLastElement(x);
	}

	public void insertAfterLastElement(T x) {
		if (aList.endOfList()) {
			aList.addBeforeCurrent(x);
		} else {
			aList.getNextNode();
			insertAfterLastElement(x);
		}
	}

	public T getFirst() {
		aList.restart();
		if (!aList.listIsEmpty()) {
			return (aList.currentValue());
		} else {
			return null;
		}
	}

	public T getNext() {
		aList.getNextNode();
		if (!aList.endOfList()) {
			return (aList.currentValue());
		} else {
			return null;
		}
	}

	public SearchingIterator getIterator(Object key) {
		return new SearchingIterator(key);
	}

	public SearchableList() {
		aList = new ListGeneric<T>();
	}

}

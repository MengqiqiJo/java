package com;

public class Sort {
	private static boolean sortingFalg;
	
	public static boolean isSortingFalg() {
		return sortingFalg;
	}

	public static void setSortingFalg(boolean sortingFalg) {
		Sort.sortingFalg = sortingFalg;
	}

	public static void sortAnything(Sortable listObjects[],  int numObjects){
		
		Sortable temp;
    		int indexSmallest, index1, index2;
    		for (index1 = 0; index1 < numObjects - 1; index1++){
    			indexSmallest = index1;
       			for (index2 = index1 + 1; 
              			index2 < numObjects; index2++)
       				if (listObjects[index2].
				     lessThan(listObjects[indexSmallest])^sortingFalg)
                				indexSmallest = index2;
       			temp = listObjects[index1];
       			listObjects[index1]  = listObjects[indexSmallest];
       			listObjects[indexSmallest] = temp;
    		}
  	}     
}

package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 *
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
	  for(int j=0; j<unsortedArray.length; j++){
      for (int i=1; i<unsortedArray.length; i++){
        if (unsortedArray[i-1]>unsortedArray[i]){
          int temp = unsortedArray[i];
          unsortedArray[i]= unsortedArray[i-1];
          unsortedArray[i-1] = temp;
        }
      }
    }
    return unsortedArray;
	}
}

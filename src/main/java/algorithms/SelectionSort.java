package algorithms;


public class SelectionSort {
  
  public int[] sort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int smallestValue = arr[i];
      int smallestIndex = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < smallestValue) {
          smallestIndex = j;
          smallestValue = arr[j];
        }
      }
      
      //Swaping array value from current index with smallest value technique to sort the array.  
      int temp = arr[i];
      arr[i] = arr[smallestIndex];
      arr[smallestIndex] = temp;
    }        

    return arr;
  }

}

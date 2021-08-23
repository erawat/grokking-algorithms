package algorithms;

public class BinarySearchRecursive {

  public int search(int[] list, int item, int low, int high) {
    int mid = (high + low) / 2;
    if (high < low) {
      return -1;
    }

    if (list[mid] == item) {
      return mid;
    } 

    if (list[mid] < item) {
      return search(list, item, mid + 1, high);
    }

    return search(list, item, low, mid - 1);    
  }
  
}

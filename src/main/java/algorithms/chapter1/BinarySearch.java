package algorithms.chapter1;

/**
 * Iterative Binary Search.
 */
public class BinarySearch {

  public int binarySearch(int[] list, int item) {
    int low = 0;
    int high = (list.length - 1);
    while (low <= high) {
      int mid = (low + high) / 2;
      int guess = list[mid];
      if (guess == item) {
        return mid;
      }
      if (guess > item) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }

    return -1;
  }
}

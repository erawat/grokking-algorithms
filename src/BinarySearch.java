/**
 * Iterative Binary Search
 */
public class BinarySearch {

    public static void main(String... args) {
        BinarySearch bs = new BinarySearch();
        int[] array = {2, 5, 6, 10, 20, 21, 25};
        int item = 2;
        int result = bs.binarySearch(array, item);
        if (result == -1)
            System.out.println("Item " + item + " not found");
        else
            System.out.println("Item " + item + " found at index " + result);
    }

    public int binarySearch(int[] list, int item) {
        int low = 0;
        int high = (list.length - 1);
        while (low <= high) {
           int mid = (low + high) / 2;
           int guess = list[mid];
           if (guess == item)
               return mid;
           if (guess > item)
               high = mid - 1;
           else
               low = mid + 1;

        }

        return -1;
    }
}

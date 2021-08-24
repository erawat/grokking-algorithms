package algorithms.chapter4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BinarySearchRecursiveTest {

  @Test
  public void testBinarySearch() {
    BinarySearchRecursive bsr = new BinarySearchRecursive();
    int[] arr = {2, 5, 6, 10, 20, 21, 25, 35, 77, 80, 99, 100, 201, 239};
    assertEquals(10, bsr.search(arr, 99, 0, arr.length - 1));
    assertEquals(-1, bsr.search(arr, 3, 0, arr.length - 1));
  }

}

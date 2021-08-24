package algorithms.chapter1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

  @Test
  void testBinarySearch() {
    BinarySearch bs = new BinarySearch();
    int[] array = {2, 5, 6, 10, 20, 21, 25};
    assertEquals(0, bs.binarySearch(array, 2));
    assertEquals(-1, bs.binarySearch(array, 15));
  }
}

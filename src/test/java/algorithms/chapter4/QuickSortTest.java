package algorithms.chapter4;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class QuickSortTest {

  @Test
  public void testSort() {
    QuickSort qs = new QuickSort();
    Integer[] unsortedList = {24, 2, 26, 99, 1, 10, 78, 12, 120};
    Integer[] expectedResult = {1, 2, 10, 12, 24, 26, 78, 99, 120};
    assertArrayEquals(expectedResult, qs.sort(unsortedList));
  }
  
}

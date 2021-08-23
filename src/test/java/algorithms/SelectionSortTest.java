package algorithms;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SelectionSortTest {
  
  @Test
  public void testSelectionSort() {
    SelectionSort ss = new SelectionSort();
    int[] expectedResult = {2, 3, 5, 6, 10};
    int[] arrayToBeSorted = {5, 10, 6, 2, 3};
    assertArrayEquals(expectedResult, ss.sort(arrayToBeSorted));
  }
}

package algorithms.chapter4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CountListNumberTest {
  
  @Test
  public void testCount() {
    CountListNumber cl = new CountListNumber();
    int[] list = {1, 3, 4, 5, 6, 7, 8, 9};
    assertEquals(8, cl.count(list));
  }
}

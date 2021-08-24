package algorithms.chapter4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SumTest {

  @Test
  public void testSum() {
    Sum s = new Sum();
    int[] list = {};
    assertEquals(0, s.sum(list));
    list = new int[]{7};
    assertEquals(7, s.sum(list));
    list = new int[]{2, 4, 6};
    assertEquals(12, s.sum(list));
  }
  
}

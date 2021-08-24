package algorithms.chapter4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxNumberTest {

  @Test
  public void testFindMaxNumber() {
    MaxNumber cd = new MaxNumber();
    int[] list = {5, 24, 4, 35, 23, 13};
    assertEquals(35, cd.find(list));
  }
  
}

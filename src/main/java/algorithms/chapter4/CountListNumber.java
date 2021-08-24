package algorithms.chapter4;

import java.util.Arrays;

public class CountListNumber {

  public int count(int[] list) {
    if (list.length == 0) {
      return 0;
    }
    
    return 1 + count(Arrays.copyOfRange(list, 1, list.length));
  }
  
}

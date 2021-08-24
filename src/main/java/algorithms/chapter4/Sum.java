package algorithms.chapter4;

import java.util.Arrays;

public class Sum {

  public int sum(int[] list) {
    if (list.length == 0) {
      return 0;
    }

    if (list.length == 1) {
      return list[0];
    }

    return list[0] + sum(Arrays.copyOfRange(list, 1, list.length));
  }
  
}

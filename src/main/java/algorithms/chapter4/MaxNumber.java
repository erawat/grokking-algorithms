package algorithms.chapter4;

import java.util.Arrays;

public class MaxNumber {

  public int find(int[] list) {
    if (list.length == 2) {
      return list[0] > list[1] ? list[0] : list[1];
    }
    int subMax = find(Arrays.copyOfRange(list, 1, list.length)); 
    
    return list[0] > subMax ? list[0] : subMax;
  }
  
}

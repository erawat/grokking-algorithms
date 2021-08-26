package algorithms.chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class QuickSort {

  public Integer[] sort(Integer[] list) {
    if (list.length < 2) {
      return list;
    }

    Integer pivot = list[0];
    Integer[] less = getLess(list, pivot);
    Integer[] greater = getGreater(list, pivot);    
    Integer[] pivotArr = {pivot};
    
    return mergeArray(sort(less), pivotArr, sort(greater));
  }

  private Integer[] getLess(Integer[] list, Integer pivot) {
    List<Integer> lessList = new ArrayList<Integer>();
    for (Integer integer : list) {
      if (integer < pivot) {
        lessList.add(integer);
      }
    }

    return lessList.toArray(new Integer[0]);
  }

  private Integer[] getGreater(Integer[] list, Integer pivot) {
    List<Integer> greaterList = new ArrayList<Integer>();
    for (Integer integer : list) {
      if (integer > pivot) {
        greaterList.add(integer);
      }
    }

    return greaterList.toArray(new Integer[0]);
  }

  private <T> Integer[] mergeArray(T[] less, T[] pivot, T[] greater) {   
    return Stream.of(less, pivot, greater).flatMap(Stream::of).toArray(Integer[]::new); 
  }   
  
}

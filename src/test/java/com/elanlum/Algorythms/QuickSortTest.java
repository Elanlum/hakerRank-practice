package com.elanlum.Algorythms;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.elanlum.Algorithms.QuickSort;
import java.util.Comparator;
import org.junit.jupiter.api.Test;

class QuickSortTest {

  @Test
  void sort() {
    Integer[] arr = {9, 7, 6, 8, 2, 1, 3, 4, 5};
    Integer[] result = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    new QuickSort().sort(arr, new IntComparator());
    assertArrayEquals(result, result);
  }
}

class IntComparator implements Comparator<Integer>{

  @Override
  public int compare(Integer o1, Integer o2) {
    return o1 < o2 ? -1 : o2 <  o1 ? 1 : 0;
  }
}
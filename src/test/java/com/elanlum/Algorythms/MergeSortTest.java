package com.elanlum.Algorythms;

import static org.junit.jupiter.api.Assertions.*;

import com.elanlum.Algorithms.MergeSort;
import org.junit.jupiter.api.Test;

class MergeSortTest {

  @Test
  void mergeSort() {
    int[] arr = {9, 7, 6, 8, 2, 1, 3, 4, 5};
    int[] result = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    assertArrayEquals(result, new MergeSort().mergeSort(arr));
  }
}
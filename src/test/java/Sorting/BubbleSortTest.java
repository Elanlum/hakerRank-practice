package Sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BubbleSortTest {

  @Test
  void countSwaps() {
    int[] arr = {3, 2, 1, 5, 6, 8, 7, 9};
    BubbleSort.countSwaps(arr);
  }
}
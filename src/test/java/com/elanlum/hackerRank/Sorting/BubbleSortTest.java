package hackerRank.Sorting;


import org.junit.jupiter.api.Test;

class BubbleSortTest {

  @Test
  void countSwaps() {
    int[] arr = {3, 2, 1, 5, 6, 8, 7, 9};
//    int[] arr = {3, 2, 1};
    BubbleSort.countSwaps(arr);
  }
}
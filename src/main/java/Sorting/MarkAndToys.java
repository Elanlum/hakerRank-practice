package Sorting;

import java.util.Arrays;

public class MarkAndToys {

  static int maximumToys(int[] prices, int k) {
    Arrays.sort(prices);
    for (int i = 0; i < prices.length; i++) {
      k -= prices[i];
      if (k < 0) {
        return i;
      }
    }
    return prices.length;
  }
}

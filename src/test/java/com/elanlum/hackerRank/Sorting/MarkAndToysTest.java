package com.elanlum.hackerRank.Sorting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MarkAndToysTest {

  @Test
  void maximumToys() {
    int[] prices = {1, 12, 5, 111, 200, 1000 ,10};
    int k = 50;

    assertEquals(4, MarkAndToys.maximumToys(prices, k));
  }
}
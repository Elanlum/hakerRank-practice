package com.elanlum.hackerRank.WarmUpChallenges;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SockMerchantTest {

  @Test
  void sockMerchant() {
    int n = 9;
    int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
    assertEquals(3, SockMerchant.sockMerchant(n, ar));
  }
}
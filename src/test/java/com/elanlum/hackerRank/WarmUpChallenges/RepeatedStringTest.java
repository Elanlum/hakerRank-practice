package com.elanlum.hackerRank.WarmUpChallenges;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RepeatedStringTest {

  @Test
  void repeatedString() {
    String s = "aba";
    long n = 10;

    assertEquals(7, RepeatedString.repeatedString(s, n));
  }
}
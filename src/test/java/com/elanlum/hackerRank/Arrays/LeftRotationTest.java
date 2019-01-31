package com.elanlum.hackerRank.Arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeftRotationTest {

  @Test
  void rotLeft() {
    int[] a = {1, 2, 3, 4, 5};
    int d = 4;

    int[] output = {5, 1, 2, 3, 4};

    assertArrayEquals(output, LeftRotation.rotLeft(a, d));
  }
}
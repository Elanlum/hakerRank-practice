package com.elanlum.hackerRank.Arrays;

public class DoubleDimensionArray {

  static int hourglassSum(int[][] arr) {
    int sum = -63;
    int tempSum;
    for (int i = 0; i < arr.length - 2; i++) {
      for (int j = 0; j < arr[0].length - 2; j++) {
        tempSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
            + arr[i + 1][j + 1]
            + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
        if (tempSum > sum) {
          sum = tempSum;
        }
      }
    }
    return sum;
  }
}

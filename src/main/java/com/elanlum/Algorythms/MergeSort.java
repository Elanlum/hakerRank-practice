package com.elanlum.Algorythms;

import java.util.Arrays;

public class MergeSort {

  public int[] mergeSort(int[] arr){
    int[] result = sortMerge(arr);
    for(int i = 0; i < result.length; i++){
      System.out.print(result[i] + " ");
    }
    return result;
  }

  private static int[] sortMerge(int[] arr) {
    int length = arr.length;
    if (length < 2) return arr;
    int middle = length / 2;
    return merge(sortMerge(Arrays.copyOfRange(arr, 0, middle)), sortMerge(Arrays.copyOfRange(arr, middle, length)));
  }

  private static int[] merge(int[] arr_1, int[] arr_2) {
    int length1 = arr_1.length;
    int length2 = arr_2.length;
    int counter1 = 0, counter2 = 0, len = length1 + length2; // counter1, counter2 - счетчики в массивах
    int[] result = new int[len];
    for (int i = 0; i < len; i++) {
      if (counter2 < length2 && counter1 < length1) {
        if (arr_1[counter1] > arr_2[counter2]) result[i] = arr_2[counter2++];
        else result[i] = arr_1[counter1++];
      } else if (counter2 < length2) {
        result[i] = arr_2[counter2++];
      } else {
        result[i] = arr_1[counter1++];
      }
    }
    return result;
  }
}

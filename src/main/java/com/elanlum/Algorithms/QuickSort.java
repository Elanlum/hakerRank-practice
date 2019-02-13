package com.elanlum.Algorithms;

import java.util.Random;

public class QuickSort {

  public static final Random RND = new Random();

  private void swap(int[] array, int i, int j) {
    int tmp = array[i];
    array[i] = array[j];
    array[j] = tmp;
  }

  private int partition(int[] array, int begin, int end) {
    int pivot = array[end];
    int i = begin - 1;

    for(int j = begin; j < end; ++j){
      System.out.println(j);
      if (array[j] <= pivot){
        i++;
        swap(array, i, j);
      }
    }
    swap(array, i + 1, end);
    return i + 1;
  }

  private void qsort(int[] array, int begin, int end) {
    if (end > begin) {
      int index = partition(array, begin, end);
      qsort(array, begin, index - 1);
      qsort(array, index + 1,  end);
    }
  }

  public void sort(int[] array) {
    qsort(array, 0, array.length - 1);
    for(int i = 0; i < array.length; i++){
      System.out.print(array[i] + " ");
    }
  }
}

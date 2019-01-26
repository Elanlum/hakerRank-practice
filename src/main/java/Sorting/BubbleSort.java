package Sorting;

import java.util.Arrays;

public class BubbleSort {

  static void countSwaps(int[] a) {

    int count = 0;
    for (int i = 0; i < a.length -1; ++i) {
      for (int j = 1; j < a.length; ++j) {
        if(a[i] > a[j]){
          swap(a, i, j);
          System.out.println();

          count++;
        }
      }

    }
    System.out.println("Array is sorted in " + count + " swaps.");
    System.out.println("First Element: " + a[0]);
    System.out.println("Last Element: " + a[a.length - 1]);

    Arrays.sort(a);
    for(int k = 0; k < a.length; ++k){
      System.out.print(a[k]);
    }
//    for(int i = 0; i < a.length; ++i){
//      System.out.print(a[i]);
//    }
  }

  private static void swap(int[] arr, int left, int right){
    int temp = arr[right];
    arr[right] = arr[left];
    arr[left] = temp;
    for(int k = 0; k < arr.length; ++k){
      System.out.print(arr[k]);
    }
  }
}

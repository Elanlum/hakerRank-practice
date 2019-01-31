package hackerRank.Sorting;

public class BubbleSort {

  static void countSwaps(int[] a) {

    int count = 0;
    for (int i = 0; i < a.length - 1; ++i) {
      for (int j = i + 1; j < a.length; ++j) {
        if (a[i] > a[j]) {
          swap(a, i, j);
          count++;
        }
      }

    }
    System.out.println("Array is sorted in " + count + " swaps.");
    System.out.println("First Element: " + a[0]);
    System.out.println("Last Element: " + a[a.length - 1]);
  }

  private static void swap(int[] arr, int left, int right) {
    int temp = arr[right];
    arr[right] = arr[left];
    arr[left] = temp;
  }
}

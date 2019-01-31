package hackerRank.Arrays;

public class LeftRotation {

  static int[] rotLeft(int[] a, int d) {
    int count = 1;
    while (count <= d) {
      int tmp = a[0];
      for (int i = 1; i < a.length; i++) {
        a[i - 1] = a[i];
      }
      a[a.length - 1] = tmp;
      count++;
    }
    return a;
  }
}

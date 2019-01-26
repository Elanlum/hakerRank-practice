package Arrays;

public class NewYearChaos {

  static String minimumBribes(int[] q) {
    int count = 0;
    int i = 1;

    for(int j = 0; j < q.length; j++) {
      if (q[j] - j > 3) {
        System.out.println("Too chaotic");
        return "Too chaotic";
      }
    }
    while (i < q.length) {

      if (q[i - 1] > q[i]) {
        int tmp = q[i];
        q[i] = q[i - 1];
        q[i - 1] = tmp;
        count++;
        i = q[i - 1];
        continue;
      }
      i++;
    }

    System.out.println(count);
    return String.valueOf(count);
  }
}

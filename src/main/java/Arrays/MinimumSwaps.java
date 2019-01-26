package Arrays;

public class MinimumSwaps {

  static int minimumSwaps(int[] arr) {

    int count = 0;
    int i = 0;
    while (i < arr.length - 1) {
      if(arr[i] - i != 1){
        int p = arr[i] - 1;
        int tmp = arr[i];
        arr[i] = arr[p];
        arr[p] = tmp;
        count++;
        if(i != 0){
          i--;
        }else {
          i = 0;
        }
        continue;
      }
      i++;
    }
    return count;
  }
}

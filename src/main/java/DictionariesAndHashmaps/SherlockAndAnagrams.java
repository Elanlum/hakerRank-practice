package DictionariesAndHashmaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SherlockAndAnagrams {

  static int sherlockAndAnagrams(String s) {
    int totalCount = 0;
    Map<String, Integer> map = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      for (int j = i + 1; j <= s.length(); j++) {
        char[] arr = s.substring(i, j).toCharArray();

        Arrays.sort(arr);
        String string = String.valueOf(arr);

        if (!map.containsKey(string)) {
          map.put(string, 1);
        } else {
          int value = map.get(string);
          totalCount = totalCount + value;
          map.put(string, value + 1);
        }

      }
    }
    return totalCount;
  }
}

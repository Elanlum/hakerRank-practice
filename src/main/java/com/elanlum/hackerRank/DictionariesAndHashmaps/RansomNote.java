package com.elanlum.hackerRank.DictionariesAndHashmaps;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

  static String checkMagazine(String[] magazine, String[] note) {

    if (magazine.length < note.length) {
      System.out.println("No");
      return "No";
    }

    Map<String, Integer> magazineMap = new HashMap<>();
    int j = 0;
    //put all words from magazine[] to Map
    for (int i = 0; i < magazine.length; i++) {

      if (!magazineMap.containsKey(magazine[i])) {
        magazineMap.put(magazine[i], 1);
      } else {
        magazineMap.put(magazine[i], magazineMap.get(magazine[i]) + 1);
      }

    }
    //check whether Map contains necessary words
    while (j < note.length) {

      if (magazineMap.containsKey(note[j]) && magazineMap.get(note[j]) > 1) {
        magazineMap.put(note[j], magazineMap.get(note[j]) - 1);
      } else if (magazineMap.containsKey(note[j]) && magazineMap.get(note[j]) == 1) {
        magazineMap.remove(note[j]);
      } else {
        System.out.println("No");
        return "No";
      }

      j++;
    }
    System.out.println("Yes");
    return "Yes";
  }
}

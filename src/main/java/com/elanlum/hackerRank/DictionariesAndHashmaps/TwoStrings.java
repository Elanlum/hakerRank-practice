package hackerRank.DictionariesAndHashmaps;

public class TwoStrings {

  static String twoStrings(String s1, String s2) {
    for (char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
      if (s1.indexOf(c) >= 0 && s2.indexOf(c) >= 0) {
        return "YES";
      }
    }
    return "NO";
  }
}

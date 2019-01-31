package hackerRank.DictionariesAndHashmaps;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwoStringsTest {

  @Test
  void twoStrings() {
    String s1 = "hello";
    String s2 = "world";

    String s3 = "hi";
    String s4 = "world";

    assertEquals("YES", TwoStrings.twoStrings(s1, s2));
    assertEquals("NO", TwoStrings.twoStrings(s3, s4));

  }
}
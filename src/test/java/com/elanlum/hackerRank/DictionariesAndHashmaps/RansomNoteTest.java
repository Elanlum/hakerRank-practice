package hackerRank.DictionariesAndHashmaps;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RansomNoteTest {

  @Test
  void checkMagazine() {
    String[] magazine = {"give", "me", "one", "grand", "today", "night"};
    String[] note = {"give", "one", "grand", "today"};

    assertEquals("Yes", RansomNote.checkMagazine(magazine, note));
  }
}
package com.elanlum.hackerRank.DictionariesAndHashmaps;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SherlockAndAnagramsTest {

  @Test
  void sherlockAndAnagrams(){
    String s1 = "ifailuhkqq";
    String s2 = "kkkk";

    assertEquals(3, SherlockAndAnagrams.sherlockAndAnagrams(s1));
    assertEquals(10, SherlockAndAnagrams.sherlockAndAnagrams(s2));
  }
}
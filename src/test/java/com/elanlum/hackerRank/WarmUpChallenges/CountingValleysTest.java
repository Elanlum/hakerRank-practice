package hackerRank.WarmUpChallenges;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountingValleysTest {

  @Test
  void countingValleys() {
    int n = 8;
    String s = "UDDDUDUU";

    assertEquals(1, CountingValleys.countingValleys(n, s));
  }
}
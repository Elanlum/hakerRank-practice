package hackerRank.WarmUpChallenges;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JumpingOnTheCloudsTest {

  @Test
  void jumpingOnClouds() {
    int[] c = {0, 0, 1, 0, 0, 1, 0};

    assertEquals(4, JumpingOnTheClouds.jumpingOnClouds(c));
  }
}
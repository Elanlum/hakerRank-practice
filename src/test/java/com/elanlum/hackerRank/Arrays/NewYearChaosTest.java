package hackerRank.Arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NewYearChaosTest {

  @Test
  void minimumBribes() {
    int[] firstInput = {2, 1, 5, 3, 4};
    int[] secondInput = {2, 5, 1, 3, 4};

    assertEquals("3", NewYearChaos.minimumBribes(firstInput));
    assertEquals("Too chaotic", NewYearChaos.minimumBribes(secondInput));
  }
}
package hackerRank.Arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinimumSwapsTest {

  @Test
  void minimumSwaps() {
    int[] arr = {1, 3, 5, 2, 4, 6, 7};

    assertEquals(3, MinimumSwaps.minimumSwaps(arr));
  }
}
package Arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DoubleDimensionArrayTest {

  @Test
  void hourglassSum() {
    int[][]arr = {{1, 1, 1, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 0},
                  {0, 0, 2, 4, 4, 0}, {0, 0, 0, 2, 0, 0}, {0, 0, 1, 2, 4, 0}};

    assertEquals(19, DoubleDimensionArray.hourglassSum(arr));
  }
}
package DictionariesAndHashmaps;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class CountTripletsTest {

  @Test
  void countTriplets() {
    Long[] a = {1L, 3L, 9L, 9L, 27L, 81L};
    List<Long> arr = Arrays.asList(a);
    long r = 3;

    assertEquals(6L, CountTriplets.countTriplets(arr, r));
  }
}
package com.elanlum.hackerRank.DictionariesAndHashmaps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountTriplets {

  static long countTriplets(List<Long> arr, long r) {
    Map<Long, Long> mapElements = new HashMap<>();
    Map<Long, Long> mapTriplets = new HashMap<>();
    // long r = 2;
    long totalCount = 0;

    for (int i = arr.size() - 1; i >= 0; i--) {
      long element = arr.get(i);

      if (mapTriplets.containsKey(element * r)) {
        totalCount += mapTriplets.get(element * r);
      }

      if (mapElements.containsKey(element * r)) {
        long value = mapElements.get(element * r);
        mapTriplets.put(element, mapTriplets.getOrDefault(element, 0L) + value);
      }

      mapElements.put(element, mapElements.getOrDefault(element, 0L) + 1);
    }
    return totalCount;
  }
}

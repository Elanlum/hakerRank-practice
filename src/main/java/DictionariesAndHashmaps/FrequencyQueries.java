package DictionariesAndHashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyQueries {

  static List<Integer> freqQuery(List<int[]> queries) {

    final Map<Integer, Integer> valueToFreq = new HashMap<>();
    final Map<Integer, Integer> freqToOccurrence = new HashMap<>();
    final List<Integer> frequencies = new ArrayList<>();

    int key;
    int value;
    Integer oldFreq;
    Integer newFreq;
    Integer oldOccurrence;
    Integer newOccurrence;
    for (int[] query : queries) {
      key = query[0];
      value = query[1];
      if (key == 3) {

        frequencies.add(freqToOccurrence.get(value) == null ? 0 : 1);
      } else {
        oldFreq = valueToFreq.get(value);
        oldFreq = oldFreq == null ? 0 : oldFreq;
        oldOccurrence = freqToOccurrence.get(oldFreq);
        oldOccurrence = oldOccurrence == null ? 0 : oldOccurrence;

        if (key == 1) {
          newFreq = oldFreq + 1;
        } else {
          newFreq = oldFreq - 1;
        }
        newOccurrence = freqToOccurrence.get(newFreq);
        newOccurrence = newOccurrence == null ? 0 : newOccurrence;

        if (newFreq < 1) {
          valueToFreq.remove(value);
        } else {
          valueToFreq.put(value, newFreq);
        }

        if ((oldOccurrence - 1) < 1) {
          freqToOccurrence.remove(oldFreq);
        } else {
          freqToOccurrence.put(oldFreq, oldOccurrence - 1);
        }
        freqToOccurrence.put(newFreq, newOccurrence + 1);
      }
    }
    return frequencies;
  }
}

package WarmUpChallenges;

public class CountingValleys {

  static int countingValleys(int n, String s) {
    int valleys = 0;
    int currentLevel = 0;
    char[] steps = s.toCharArray();
    for (int i = 0; i < steps.length; i++) {
      if (steps[i] == 'D' && currentLevel == 0) {
        valleys++;
        currentLevel--;
      } else if (steps[i] == 'U') {
        currentLevel++;
      } else if (steps[i] == 'D') {
        currentLevel--;
      }
    }
    return valleys;
  }
}

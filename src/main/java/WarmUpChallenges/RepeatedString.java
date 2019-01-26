package WarmUpChallenges;

public class RepeatedString {

  static long repeatedString(String s, long n) {

    long factor = (n / s.length());
    long rem = (n % s.length());
    long count = 0;
    /*
    Count number of a's in base string
     */
    for (char c : s.toCharArray()) {
      if (c == 'a') {
        count++;
      }
    }

    /*
    multiply number of a's by number of repeatable strings
     */
    count = factor * count;

    /*
    add a number of a's in the end of the string
     */
    for (int i = 0; i < rem; i++) {
      if (s.charAt(i) == 'a') {
        count++;
      }
    }

    System.out.println(n + "/" + s.length() + " = factor = " + factor);
    System.out.println(n + "%" + s.length() + " = rem = " + rem);
    System.out.println("result = " + count);
    return count;
  }
}

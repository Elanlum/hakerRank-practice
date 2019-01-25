package WarmUpChallenges;

public class RepeatedString {

  static long repeatedString(String s, long n) {

    long count = 0;
    for (char c : s.toCharArray()) {
      if (c == 'a') {
        count++;
      }
    }

    long factor = (n / s.length());
    long rem = (n % s.length());
    count = factor * count;
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

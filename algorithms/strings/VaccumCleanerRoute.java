package algorithms.strings;

public class VaccumCleanerRoute {
  public static void main(String[] args) {
    System.out.println(vacuumReturnsToStart("LR"));
    System.out.println(vacuumReturnsToStart("URURD"));
    System.out.println(vacuumReturnsToStart("RUULLDRD"));
  }

  private static boolean vacuumReturnsToStart(String str) {
    int up = 1;
    int down = -1;
    int left = -1;
    int right = 1;

    int ans = 0;
    for (char ch : str.toCharArray()) {
      if (ch == 'L') ans++;
      else if (ch == 'R') ans += right;
      else if (ch == 'U') ans += up;
      else if (ch == 'D') ans += down;
    }
    return ans == 0;
  }
}

package algorithms.greedy;

import java.util.Arrays;

public class MinWaitingTime {
  public static void main(String[] args) {
    System.out.println(minWaitingTime(new int[]{3, 2, 1, 2, 6}));
  }

  private static int minWaitingTime(int[] queries) {
    Arrays.sort(queries);

    int totalWaitingTime = 0;

    for (int i = 0; i < queries.length; i++) {
      int duration = queries[i];
      int totalQueries = queries.length - (i + 1);

      totalWaitingTime += totalQueries * duration;
    }
    return totalWaitingTime;
  }
}

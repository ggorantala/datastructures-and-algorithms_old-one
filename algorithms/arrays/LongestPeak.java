package algorithms.arrays;

public class LongestPeak {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};

    System.out.println(longestPeak(array));
  }

  private static int longestPeak(int[] array) {
    int i = 1;
    int longestPeak = Integer.MIN_VALUE;
    while (i < array.length) {
      int currentPeak = 0;
      int a = i - 1;
      int b = i + 1;
      while (array[i] > array[a] || array[i] < array[b]) {
        if (array[i] > array[a]) {
          currentPeak++;
        }
        if (array[i] < array[i + 1]) {
          currentPeak++;
        }

        // Need to finish this
      }
    }

    return -1;
  }
}

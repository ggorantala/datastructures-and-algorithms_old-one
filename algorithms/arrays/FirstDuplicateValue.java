package algorithms.arrays;

import java.util.HashSet;

public class FirstDuplicateValue {
  public static void main(String[] args) {
    int[] array = {2, 1, 5, 2, 3, 3, 4};
    System.out.println(findIndex(array));
    System.out.println(findIndexLookup(array));
    System.out.println(findIndexFastest(array));
  }

  // Time  : O(n^2) -- Brute Force, where n is the number of elements
  // Space: (1)
  private static int findIndex(int[] array) {
    int minSecondIndex = array.length;
    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] == array[j]) {
          minSecondIndex = Math.min(minSecondIndex, j);
        }
      }
    }

    if (minSecondIndex == array.length) {
      return -1;
    }
    return array[minSecondIndex];
  }

  // Time  : O(n) -- where n is the number of elements
  // Space: O(n) -- storing elements in to the data structure.
  private static int findIndexLookup(int[] array) {
    HashSet<Integer> seen = new HashSet<>();

    for (int i = 0; i < array.length; ++i) {
      if (seen.contains(array[i])) {
        return array[i];
      }
      seen.add(array[i]);
    }
    return -1;
  }

  private static int findIndexFastest(int[] array) {
    for (int value : array) {
      int absValue = Math.abs(value);

      if (array[absValue - 1] < 0) {
        return absValue;
      }

      array[absValue - 1] *= -1;
    }
    return -1;
  }
}
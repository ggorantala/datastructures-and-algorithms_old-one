package algorithms.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class TwoNumberSum {
  public static void main(String[] args) {
    int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
    int targetSum = 10;
    System.out.println(Arrays.toString(twoSumBruteForce(array, targetSum)));
    System.out.println(Arrays.toString(twoSumLookup(array, targetSum)));
    System.out.println(Arrays.toString(twoSumTwoPointerApproach(array, targetSum)));
  }

  //// O(n^2) time | O(1) space
  private static int[] twoSumBruteForce(int[] array, int targetSum) {
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] + array[j] == targetSum) {
          return new int[]{array[i], array[j]};
        }
      }
    }
    return new int[0];
  }

  private static int[] twoSumLookup(int[] array, int targetSum) {
    HashSet<Integer> set = new HashSet<>();

    for (int value : array) {
      int potentialDifference = targetSum - value;

      if (set.contains(potentialDifference)) {
        return new int[]{potentialDifference, value};
      } else {
        set.add(value);
      }
    }
    return new int[0];
  }

  private static int[] twoSumTwoPointerApproach(int[] array, int targetSum) {
    Arrays.sort(array);
    int left = 0;
    int right = array.length - 1;

    while (left < right) {
      int sum = array[left] + array[right];

      if (sum == targetSum) {
        return new int[]{array[left], array[right]};
      } else if (sum < targetSum) {
        left++;
      } else {
        right--;
      }
    }
    return new int[0];
  }
}

package algorithms.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {
  public static void main(String[] args) {
    int[] array = {12, 3, 1, 2, -6, 5, -8, 6};
    int targetSum = 0;

    System.out.println(threeSum(array, targetSum));
  }

  private static List<Integer[]> threeSum(int[] array, int targetSum) {
    List<Integer[]> result = new ArrayList<>();
    Arrays.sort(array);

    for (int i = 0; i < array.length - 2; ++i) {
      int left = i + 1;
      int right = array.length - 1;

      while (left < right) {
        int sum = array[i] + array[left] + array[right];

        if (sum == targetSum) {
          Integer[] ans = {array[i], array[left], array[right]};
          if (!result.contains(ans)) {
            result.add(ans);
          }
          left++;
          right--;
        } else if (sum > targetSum) {
          right--;
        } else {
          left++;
        }
      }
    }
    return result;
  }
}

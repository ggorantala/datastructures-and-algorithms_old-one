package algorithms.arrays;

public class TrappingRainWater {
  public static void main(String[] args) {
    int[] heights = {0, 1, 0, 2, 1, 0, 3, 1, 0, 1, 2};
    System.out.println(trapWater(heights));
    System.out.println(trapWaterOptimal(heights));
  }

  // O(n^2) time and O(1) space
  private static int trapWater(int[] heights) {
    int totalWater = 0;
    for (int p = 0; p < heights.length; p++) {
      int leftPointer = p;
      int rightPointer = p;

      int maxLeft = 0;
      int maxRight = 0;

      while (leftPointer >= 0) {
        maxLeft = Math.max(maxLeft, heights[leftPointer--]);
      }

      while (rightPointer < heights.length) {
        maxRight = Math.max(maxRight, heights[rightPointer++]);
      }

      int currentHeight = heights[p];
      int currentWater = Math.min(maxLeft, maxRight) - currentHeight;

      if (currentWater >= 0) {
        totalWater += currentWater;
      }
    }
    return totalWater;
  }

  //O(n) time and O(1) space
  private static int trapWaterOptimal(int[] heights) {
    int total = 0;

    int left = 0;
    int right = heights.length - 1;
    int maxLeft = 0;
    int maxRight = 0;
    while (left < right) {
      if (heights[left] <= heights[right]) {
        if (heights[left] > maxLeft) {
          maxLeft = heights[left];
        } else {
          total += maxLeft - heights[left];
        }
        left++;
      } else {
        if (heights[right] > maxRight) {
          maxRight = heights[right];
        } else {
          total += maxRight - heights[right];
        }
        right--;
      }
    }
    return total;
  }
}

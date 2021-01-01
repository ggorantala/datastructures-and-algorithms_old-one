package algorithms.arrays;

public class TrappingRainWater {
  public static void main(String[] args) {
    int[] array = {0, 1, 0, 2, 1, 0, 3, 1, 0, 1, 2};
    System.out.println(trapWater(array));
  }

  private static int trapWater(int[] array) {
    int totalWater = 0;
    for (int p = 0; p < array.length; p++) {
      int leftPointer = p;
      int rightPointer = p;

      int maxLeft = 0;
      int maxRight = 0;

      while (leftPointer >= 0) {
        maxLeft = Math.max(maxLeft, array[leftPointer--]);
      }

      while (rightPointer < array.length) {
        maxRight = Math.max(maxRight, array[rightPointer++]);
      }

      int currentWater = Math.min(maxLeft, maxRight) - array[p];

      if (currentWater >= 0) {
        totalWater += currentWater;
      }
    }
    return totalWater;
  }
}

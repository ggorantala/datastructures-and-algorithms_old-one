package algorithms.arrays;

public class MaximumSubArraySum {
  public static void main(String[] args) {
    int[] array = {1, 7, -2, -5, 10, -1};
    System.out.println(maxSubArray(array));
  }

  private static int maxSubArray(int[] array) {
    int maxSum = 0;
    int sum = 0;

    for (int i = 0; i < array.length; i++) {
      sum += array[i];
      if (sum > maxSum) {
        maxSum = sum;
      }
    }
    return maxSum;
  }
}

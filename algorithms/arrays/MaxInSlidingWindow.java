package algorithms.arrays;

public class MaxInSlidingWindow {
  public static void main(String[] args) {
    int[] array = {-4, 2, -5, 3, 6, 10, -1, 11};
    System.out.println(maxSlidingSum(array));
  }

  private static int maxSlidingSum(int[] array) {
    int maxSum = 0;
    int index = 0;
    int currentSum = 0;
    int k =0;

    for (int j : array) {
      currentSum += j;
      k++;
      if (k >= 3) {
        k--;
        maxSum = Math.max(currentSum, maxSum);
        currentSum -= array[index++];
      }
    }
    return maxSum;
  }
}

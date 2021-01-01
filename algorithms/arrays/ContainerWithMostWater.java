package algorithms.arrays;

public class ContainerWithMostWater {
  public static void main(String[] args) {
    System.out.println(mostWater(new int[]{7, 1, 2, 3, 9}));
    System.out.println(mostWaterOptimal(new int[]{7, 1, 2, 3, 9}));
  }

  /**
   * area = L X W
   */
  private static int mostWater(int[] array) {
    if (array.length <= 1)
      return 0;

    int result = 0;
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = i + 1; j < array.length; j++) {
        int minElement = Math.min(array[i], array[j]);
        result = Math.max(result, (minElement * (j - i)));
      }
    }
    return result;
  }

  private static int mostWaterOptimal(int[] array) {
    int i = 0;
    int j = array.length - 1;
    int maxArea = 0;

    while (i < j) {
      int minElement = Math.min(array[i], array[j]);
      maxArea = Math.max(minElement * (j - i), maxArea);
      if (array[i] < array[j]) {
        i++;
      } else {
        j--;
      }
    }
    return maxArea;
  }
}

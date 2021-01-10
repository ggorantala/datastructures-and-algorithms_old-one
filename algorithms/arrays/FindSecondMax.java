package algorithms.arrays;

public class FindSecondMax {
  public static void main(String[] args) {
    int[] array = {4, 2, 1, 5, 0};
    System.out.println(secondMax(array));
  }

  private static int secondMax(int[] array) {
    int firstMax = Math.max(array[1], array[0]);
    int secondMax = Math.min(array[0], array[1]);

    for (int i = 0; i < array.length; i++) {
      if (firstMax < array[i]) {
        secondMax = firstMax;
        firstMax = array[i];
      } else if (secondMax < array[i] && array[i] < firstMax) {
        secondMax = array[i];
      }
    }
    return secondMax;
  }
}

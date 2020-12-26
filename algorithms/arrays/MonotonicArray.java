package algorithms.arrays;

public class MonotonicArray {
  public static void main(String[] args) {
    int[] array = {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
    System.out.println(isMonotonic(array));
  }

  private static boolean isMonotonic(int[] array){
    boolean isInc = true;
    boolean isDec = true;
    for (int i = 1; i < array.length; i++) {
      if (array[i] > array[i - 1]) {
        isDec = false;
      }
      if (array[i] < array[i - 1]) {
        isInc = false;
      }
    }
    return isInc || isDec;
  }
}

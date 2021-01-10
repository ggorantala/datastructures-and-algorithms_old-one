package algorithms.arrays;

import java.util.Arrays;

public class RotateArrayKthIndex {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};

    System.out.println(Arrays.toString(rotateArray(array, 1)));
  }

  private static int[] rotateArray(int[] array, int k) {
    k = k % array.length;

    rotate(array, 0, array.length - 1);
    rotate(array, k, array.length - 1);
    return array;
  }

  private static void rotate(int[] array, int i, int j) {
    while (i < j) {
      int temp = array[i];
      array[i++] = array[j];
      array[j--] = temp;
    }
  }

}

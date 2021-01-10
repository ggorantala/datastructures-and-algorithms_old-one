package algorithms.arrays;

import java.util.Arrays;

public class MaxMin {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};

    System.out.println(Arrays.toString(maxMinOptimal(array)));
  }

  private static int[] maxMinOptimal(int[] arr) {
    int maxIdx = arr.length - 1;
    int minIdx = 0;
    int maxElem = arr[maxIdx] + 1;
    for (int i = 0; i < arr.length; i++) {
      if (i % 2 == 0) {
        arr[i] += (arr[maxIdx] % maxElem) * maxElem;
        maxIdx -= 1;
      } else {
        arr[i] += (arr[minIdx] % maxElem) * maxElem;
        minIdx += 1;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] / maxElem;
    }
    return arr;
  }
}

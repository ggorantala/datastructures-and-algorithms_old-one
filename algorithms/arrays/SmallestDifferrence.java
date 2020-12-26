package algorithms.arrays;

import java.util.Arrays;

public class SmallestDifferrence {
  public static void main(String[] args) {
    int[] arrayOne = {-1, 5, 10, 20, 28, 3};
    int[] arrayTwo = {26, 134, 135, 15, 17};

    System.out.println(Arrays.toString(smallestDifference(arrayOne, arrayTwo)));
  }

  // O(nlog(n) + mlog(m)) time | O(1) space
  private static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
    int[] result = new int[2];
    int smallest = Integer.MAX_VALUE;
    int current;
    int idxOne = 0;
    int idxTwo = 0;

    Arrays.sort(arrayOne);
    Arrays.sort(arrayTwo);

    while (idxOne < arrayOne.length && idxTwo < arrayTwo.length) {
      int firstNum = arrayOne[idxOne];
      int secondNum = arrayTwo[idxTwo];
      if (firstNum < secondNum) {
        current = secondNum - firstNum;
        idxOne++;
      } else if (firstNum > secondNum) {
        current = firstNum - secondNum;
        idxTwo++;
      } else {
        return new int[]{firstNum, secondNum};
      }

      if (smallest > current) {
        smallest = current;
        result[0] = firstNum;
        result[1] = secondNum;
      }
    }
    return result;
  }
}

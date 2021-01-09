package algorithms.arrays;

import java.util.Arrays;

public class MergeSortedArrays {
  public static void main(String[] args) {
    int[] a = new int[]{3, 4, 6, 10, 11, 15};
    int[] b = new int[]{1, 5, 8, 12, 14, 19};

    System.out.println(Arrays.toString(mergeArrays(a, b)));
  }

  public static int[] mergeArrays(int[] myArray, int[] alicesArray) {

    int[] mergedArray = new int[myArray.length + alicesArray.length];

    int j = 0;
    int i = 0;
    int k = 0;

    while (k < mergedArray.length) {

      // case: my array is exhausted
      if (i >= myArray.length) {
        mergedArray[k++] = alicesArray[j++];

        // case: Alice's array is exhausted
      } else if (j >= alicesArray.length) {
        mergedArray[k++] = myArray[i++];

        // case: my item is next
      } else if (myArray[i] < alicesArray[j]) {
        mergedArray[k++] = myArray[i++];

        // case: Alice's item is next
      } else {
        mergedArray[k++] = alicesArray[j++];
      }
    }

    return mergedArray;
  }
}

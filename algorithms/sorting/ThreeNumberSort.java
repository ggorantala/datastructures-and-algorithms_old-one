package algorithms.sorting;

import java.util.Arrays;

public class ThreeNumberSort {
  public static void main(String[] args) {
    int[] array = {1, 0, 0, -1, -1, 0, 1, 1};
    int[] order = {0, 1, -1};
//    System.out.println(Arrays.toString(threeNumbersSort(array, order)));
    System.out.println(Arrays.toString(threeNumbersSort_01(array, order)));
    System.out.println(Arrays.toString(threeNumbersOptimised(array, order)));
  }

  private static int[] threeNumbersSort(int[] array, int[] order) {
    int[] valueCounts = {0, 0, 0};

    for (int element : array) {
      int orderIdx = getIndex(order, element);
      valueCounts[orderIdx] += 1;
    }

    for (int i = 0; i < 3; i++) {
      int value = order[i];
      int count = valueCounts[i];

      int numElementsBefore = getSum(valueCounts, i);

      for (int n = 0; n < count; n++) {
        int currentIdx = numElementsBefore + n;
        array[currentIdx] = value;
      }
    }

    return array;
  }

  public static int getIndex(int[] array, int element) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == element) {
        return i;
      }
    }
    return -1;
  }

  private static int getSum(int[] array, int end) {
    int sum = 0;
    for (int i = 0; i < end; i++)
      sum += array[i];

    return sum;
  }

  private static int[] threeNumbersSort_01(int[] array, int[] order){
    int firstValue = order[0];
    int thirdValue = order[2];

    int firstIdx = 0;
    for(int i = 0; i < array.length; i++){
      if(array[i] == firstValue){
        swap(firstIdx, i, array);
        firstIdx++;
      }
    }

    int lastIdx = array.length - 1;
    for(int i = array.length - 1; i>= 0; i--){
      if(array[i] == thirdValue){
        swap(lastIdx, i, array);
        lastIdx--;
      }
    }

    return array;
  }

  private static void swap(int i, int j, int[] array){
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  private static int[] threeNumbersOptimised(int[] array, int[] order){
    int firstIdx = 0;
    int secondIdx = 0;
    int lastIdx = array.length - 1;

    int firstValue = order[0];
    int secondValue = order[1];

    while( secondIdx <= lastIdx){
      int value = array[secondIdx];

      if(value == firstValue){
        swap(firstIdx, secondIdx, array);
        firstIdx++;
        secondIdx++;
      }else if(value == secondValue){
        secondIdx++;
      }else{
        swap(secondIdx, lastIdx, array);
        lastIdx--;
      }
    }
    return array;
  }

}

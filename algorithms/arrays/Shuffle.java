package algorithms.arrays;


import java.util.Arrays;
import java.util.Random;


public class Shuffle {
  public static void main(String[] args) {
    naiveShuffle(new int[]{1,2,3});
  }


  private static Random rand = new Random();

  private static int getRandom(int floor, int ceiling) {
    return rand.nextInt((ceiling - floor) + 1) + floor;
  }

  public static void naiveShuffle(int[] array) {

    // for each index in the array
    for (int firstIndex = 0; firstIndex < array.length; firstIndex++) {

      // grab a random other index
      int secondIndex = getRandom(0, array.length - 1);

      // and swap the values
      if (secondIndex != firstIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
      }
    }
    System.out.println(Arrays.toString(array));
  }
}
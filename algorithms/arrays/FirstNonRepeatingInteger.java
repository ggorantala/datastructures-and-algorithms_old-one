package algorithms.arrays;

import java.util.HashMap;

public class FirstNonRepeatingInteger {
  public static void main(String[] args) {
    int[] arr = {2, 54, 7, 2, 6, 54};
    System.out.println(findFirstUnique(arr));
  }

  private static int findFirstUnique(int[] arr){
    HashMap<Integer, Integer> lookup = new HashMap<>();

    for(int el : arr){
      lookup.put(el, lookup.getOrDefault(el, 0) + 1);
    }

    for(int el : arr){
      if(lookup.get(el) == 1){
        return el;
      }
    }
    return -1;
  }
}

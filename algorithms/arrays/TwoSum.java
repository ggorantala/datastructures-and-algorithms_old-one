package algorithms.arrays;

import java.util.HashSet;
import java.util.Set;

class TwoSum {
  public static int[] twoNumberSum(int[] array, int targetSum) {

    Set<Integer> set = new HashSet<>();
    for(int num : array){
      int potentialDiff = targetSum - num;

      if(set.contains(potentialDiff)){
        return new int[]{potentialDiff, num};
      }
      set.add(num);
    }
    return new int[0];
  }
}

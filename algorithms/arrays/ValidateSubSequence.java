package algorithms.arrays;

import java.util.Arrays;
import java.util.List;

public class ValidateSubSequence {
  public static void main(String[] args) {
    List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
    List<Integer> sequence = Arrays.asList(1, 6, -1, 10);

    System.out.println(validateSequence(array, sequence));
  }

  // O(n) time | O(1) space
  private static boolean validateSequence(List<Integer> array, List<Integer> sequence) {
    int i = 0;
    int j = 0;
    while (i < array.size() && j < sequence.size()) {
      if (array.get(i).equals(sequence.get(j))) {
        j++;
      }
      i++;
    }
    return j == sequence.size();
  }
}

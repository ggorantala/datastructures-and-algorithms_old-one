package algorithms.arrays;

import java.util.Arrays;
import java.util.List;

public class MoveElementToEnd {
  public static void main(String[] args) {
    List<Integer> array = Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2);
    int toMove = 2;

    System.out.println(moveElementToEnd(array, toMove));
  }

  public static List<Integer> moveElementToEnd(List<Integer> arr, int target) {
    int i = 0;
    int j = arr.size() - 1;

    while(i < j){
      if(arr.get(j) == (target)){
        j--;
        continue;
      }

      if(arr.get(i) == target){
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
      }
      i++;
    }
    return arr;
  }
}

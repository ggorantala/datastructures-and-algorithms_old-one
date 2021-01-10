package algorithms.arrays;

public class FindSecondMin {
  public static void main(String[] args) {
    int[] arr = {1, 9, 2, 0, 3, 6};
    System.out.println(findSecondMin(arr));
  }

  private static int findSecondMin(int[] arr) {
    int first = Math.min(arr[0], arr[1]);
    int second = Math.max(arr[0], arr[1]);

    for (int i = 2; i < arr.length; i++) {
      if( second > arr[i] && first < arr[i]){
        second = arr[i];
      }else if( second > arr[i] && first> arr[i]){
        first = Math.min(second, arr[i]);
        second= first;

      }
    }
    return second;
  }
}

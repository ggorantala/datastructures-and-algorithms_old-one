package algorithms.arrays;

public class FindMinimum {
  public static void main(String[] args) {
    int[] arr = { 9, 2, 3, 6};
    System.out.println(findMinimum(arr));
  }

  private static int findMinimum(int[] arr){
    int min = arr[0];

    for(int i = 1; i<arr.length; i++){
      if( min > arr[i]){
        min = arr[i];
      }
    }
    return min;
  }
}

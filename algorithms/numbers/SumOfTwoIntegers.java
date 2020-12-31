package algorithms.numbers;

public class SumOfTwoIntegers {
  public static void main(String[] args) {
    System.out.println(getSum(1, 2));
    System.out.println(getSum(-2, 3));
  }

  private static int getSum(int a, int b) {
    while (b != 0) {
      int carry = a & b;
      a ^= b;
      b = carry << 1;
    }
    return a;
  }
}

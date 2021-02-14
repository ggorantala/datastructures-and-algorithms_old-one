package abcs.oops;

public class Test {
  private static int helper(int n) {
    int count = 0;
    while (n > 0) {
      n &= (n - 1);
      count++;
    }
    return count;
  }

  public static void main(String[] args) {
//    int number = 125;
    System.out.println("SetBit Count is : " + (helper(125) == 6));
    System.out.println("SetBit Count is : " + (helper(12) == 3));
    System.out.println("SetBit Count is : " + (helper(7) == 3));
    System.out.println("SetBit Count is : " + (helper(1) == 1));
    System.out.println("SetBit Count is : " + (helper(0) == 0));
    System.out.println("SetBit Count is : " + (helper(64) == 1));
  }
}

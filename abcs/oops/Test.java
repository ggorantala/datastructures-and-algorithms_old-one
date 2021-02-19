package abcs.oops;

public class Test {

  private static String test(String str){
    char[] chars = str.toCharArray();
    int l = 0, r = str.length() - 1;
    while( l < r){
      char ch = chars[l];
      chars[l++] = chars[r];
      chars[r--] = ch;
    }
    return new String(chars);
  }

  private static int helper(int n) {
    int count = 0;
    while (n > 0) {
      n &= (n - 1);
      count++;
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(test("abc"));
//    int number = 125;
    System.out.println("SetBit Count is : " + (helper(125) == 6));
    System.out.println("SetBit Count is : " + (helper(12) == 3));
    System.out.println("SetBit Count is : " + (helper(7) == 3));
    System.out.println("SetBit Count is : " + (helper(1) == 1));
    System.out.println("SetBit Count is : " + (helper(0) == 0));
    System.out.println("SetBit Count is : " + (helper(64) == 1));
  }
}

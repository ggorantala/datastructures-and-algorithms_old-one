package algorithms.strings;

public class AddBinary {
  public static void main(String[] args) {
    System.out.println(addBinary("100", "1"));
  }

  private static String addBinary(String s1, String s2) {
    StringBuilder sb = new StringBuilder();

    int i = s1.length() - 1;
    int j = s2.length() - 1;

    int carry = 0;
    while (i >= 0 || j >= 0) {
      int sum = carry;

      sum += i >= 0 ? s1.charAt(i--) - '0' : 0;
      sum += j >= 0 ? s2.charAt(j--) - '0' : 0;

      sb.append(sum % 2);
      carry = sum / 2;
    }
    if (carry != 0) {
      sb.append(1);
    }
    return sb.toString();
  }
}

package algorithms.strings;

import java.util.Arrays;

public class ReverseString {
  public static void main(String[] args) {
    System.out.println(reverseStr("Cat"));
    System.out.println(reverseStr("The Daily Byte"));
    System.out.println(reverseStr("civic"));
  }

  private static String reverseStr(String str) {
    int left = 0;
    int right = str.length() - 1;
    char[] chars = str.toCharArray();
    while (left < right) {
      char ch = chars[left];
      chars[left++] = chars[right];
      chars[right--] = ch;
    }
    return new String(chars);
  }
}

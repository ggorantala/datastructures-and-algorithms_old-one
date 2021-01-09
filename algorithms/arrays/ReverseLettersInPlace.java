package algorithms.arrays;

public class ReverseLettersInPlace {
  public static void main(String[] args) {
    System.out.println(reverse(new char[]{'g', 'o', 'p', 'i'}));
  }

  private static char[] reverse(char[] chars) {
    int leftIndex = 0, rightIndex = chars.length - 1;

    while (leftIndex < rightIndex) {
      char temp = chars[rightIndex];
      chars[rightIndex--] = chars[leftIndex];
      chars[leftIndex++] = temp;
    }
    return chars;
  }
}

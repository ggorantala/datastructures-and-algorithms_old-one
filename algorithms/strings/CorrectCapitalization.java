package algorithms.strings;

public class CorrectCapitalization {
  public static void main(String[] args) {
    System.out.println(correctCapitalization("USA"));
    System.out.println(correctCapitalization("Calvin"));
    System.out.println(correctCapitalization("compUter"));
    System.out.println(correctCapitalization("coding"));
  }

  // Runtime: O(N) where N is the number of characters in our word
  // Space complexity: O(1) or constant
  private static boolean correctCapitalization(String str) {
    int count = Character.isUpperCase(str.charAt(0)) ? 1 : 0;

    for (int i = 1; i < str.length(); i++) {
      if (Character.isUpperCase(str.charAt(i))) {
        count++;
      }
    }
    return count == 0 || count == str.length() || count == 1 && Character.isUpperCase(str.charAt(0));
  }
}

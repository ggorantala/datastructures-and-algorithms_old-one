package algorithms.strings;

public class ValidPalindrome {
  public static void main(String[] args) {
    System.out.println(isPalindrome("level"));
    System.out.println(isPalindrome("algorithm"));
    System.out.println(isPalindrome("A man, a plan, a canal: Panama."));
  }

  // Time = O(n) and Space = O(1)
  private static boolean isPalindrome(String str) {
    int i = 0;
    int j = str.length() - 1;

    while (i < j) {
      while (i < j && !Character.isLetterOrDigit(str.charAt(i))) {
        i++;
      }

      while (i < j && !Character.isLetterOrDigit(str.charAt(j))) {
        j--;
      }

      if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
}

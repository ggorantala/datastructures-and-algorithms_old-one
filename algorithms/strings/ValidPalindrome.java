package algorithms.strings;

public class ValidPalindrome {
  public static void main(String[] args) {
    System.out.println(isPalindrome("level"));
    System.out.println(isPalindrome("algorithm"));
    System.out.println(isPalindrome("A man, a plan, a canal: Panama."));
  }

  /**
   * Runtime: O(N) where N is the number of characters in the given string because we only traverse the string once
   * (even though there are nested loops - don’t be fooled!).
   *
   * Space complexity: O(1) or constant as we only need couple variables to solve the problem (regardless of
   * the size of the string)
   */
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

package algorithms.strings;

public class ValidPalindromeWithRemoval {
  public static void main(String[] args) {
    System.out.println(validPalindromeRemoval("abcba"));
    System.out.println(validPalindromeRemoval("foobof"));
    System.out.println(validPalindromeRemoval("abccab"));
  }

  /**
   * Big-O Analysis
   *
   * Runtime: O(N) where N is the number of characters in our string
   * Space complexity: O(1) or constant
   *
   */
  private static boolean validPalindromeRemoval(String str) {
    int i = 0;
    int j = str.length() - 1;

    while(i < j){
      if(str.charAt(i) !=str.charAt(j)){
        return isPalindrome(str, i +1, j) || isPalindrome(str, i, j-1);
        }
      i++;
      j--;
    }
    return true;
  }

  private static boolean isPalindrome(String str, int left, int right) {
    while (left < right) {
      if (str.charAt(left++) != str.charAt(right--)) {
        return false;
      }
    }
    return true;
  }
}

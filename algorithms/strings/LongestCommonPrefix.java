package algorithms.strings;

public class LongestCommonPrefix {
  public static void main(String[] args) {
    System.out.println(longestCommonPrefix(new String[]{"colorado", "color", "cold"}));
    System.out.println(longestCommonPrefix(new String[]{"a", "b", "c"}));
    System.out.println(longestCommonPrefix(new String[]{"spot", "spotty", "spotted"}));
  }

  /**
   * Big-O Analysis
   * Runtime: O(N*M) where N is the number of words we’re given and M is the max number of characters a single string can contain.
   * This runtime is derived from the fact that the worst case we will traverse every word and every character in every word.
   *
   * Space complexity: O(M) where M is the max number of characters a string can contain. This is because the longest our
   *
   * prefix can become is M characters long.
   */
  private static String longestCommonPrefix(String[] strs) {
    StringBuilder longestSubStr = new StringBuilder();
    int index = 0;
    for (char ch : strs[0].toCharArray()) {
      for (int i = 1; i < strs.length; i++) {
        if (index >= strs[i].length() || ch != strs[i].charAt(index)) {
          return longestSubStr.toString();
        }
      }
      longestSubStr.append(ch);
      index++;
    }
    return longestSubStr.toString();
  }
}

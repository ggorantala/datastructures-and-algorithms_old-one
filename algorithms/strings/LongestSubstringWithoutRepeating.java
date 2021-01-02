package algorithms.strings;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {
  public static void main(String[] args) {
    String str = "abccbakjlmka";
    System.out.println(longestSubStr(str)); // return int
    System.out.println(longestSubstringWithoutDuplication(str)); // return int
  }

  private static int longestSubStr(String str) {
    HashSet<Character> set = new HashSet<>();

    int i = 0, j = 0;

    int ans = 0;
    while (i < str.length() && j < str.length()) {
      if (!set.contains(str.charAt(j))) {
        set.add(str.charAt(j++));
        ans = Math.max(ans, j - i);
      } else {
        set.remove(str.charAt(i++));
      }
    }
    return ans;
  }


  private static String longestSubstringWithoutDuplication(String s) {
    int[] array = {-1, -1};
    int i = 0, j = 0;
    int ans = 0;
    HashSet<Character> set = new HashSet<>();
    while (i < s.length() && j < s.length()) {
      if (!set.contains(s.charAt(j))) {
        set.add(s.charAt(j++));
        if (j - i > ans) {
          array[0] = i;
          array[1] = j;
          ans = j - i;
        }
      } else {
        set.remove(s.charAt(i++));
      }
    }
    return s.substring(array[0], array[1]);
  }
}

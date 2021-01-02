package algorithms.strings;

import java.util.HashMap;

public class LongestSubStringWithKMostDistinct {

  public static void main(String[] args) {
    System.out.println(lengthOfLongestSubstringKDistinct("eceba", 2));
  }

  public static int lengthOfLongestSubstringKDistinct(String s, int k) {
    if (k == 0) {
      return 0;
    }
    int ans = 0;

    HashMap<Character, Integer> map = new HashMap<>();

    for (int i = 0, j = 0; j < s.length(); j++) {
      char ch = s.charAt(j);
      if (map.containsKey(ch)) {
        map.put(ch, map.get(ch) + 1);
      } else {
        if (map.size() >= k) {
          while (true) {
            char startChar = s.charAt(i++);
            if (map.containsKey(startChar)) {
              if (map.get(startChar) == 1) {
                map.remove(startChar);
                break;
              } else {
                map.put(startChar, map.get(startChar) - 1);
              }
            }
          }
        }
        map.put(ch, 1);
      }
      ans = Math.max(ans, j - i + 1);
    }
    return ans;
  }
}

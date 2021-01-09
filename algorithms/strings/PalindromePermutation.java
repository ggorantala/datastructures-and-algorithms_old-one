package algorithms.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PalindromePermutation {
  public static void main(String[] args) {
    System.out.println(canPermutePalindrome("code"));
    System.out.println(canPermutePalindrome("aab"));
  }

  /**
   * If a string with an even length is a palindrome, every character in the string must always occur an even number of times.
   * If the string with an odd length is a palindrome, every character except one of the characters must always occur an even number of times.
   * Thus, in case of a palindrome, the number of characters with odd number of occurrences can't exceed 1(1 in case of odd length and 0 in case of even length).
   */
  public static boolean canPermutePalindrome(String s) {
    HashMap<Character, Integer> map = new HashMap<>();

    for (char ch : s.toCharArray()) {
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }

    int count = 0;

    for (char ch : map.keySet()) {
      count += map.get(ch) % 2;
    }
    return count <= 1;
  }

  public static boolean hasPalindromePermutation(String theString) {

    // track characters we've seen an odd number of times
    Set<Character> unpairedCharacters = new HashSet<>();

    for (int i = 0; i < theString.length(); i++) {
      char ch = theString.charAt(i);
      if (unpairedCharacters.contains(ch)) {
        unpairedCharacters.remove(ch);
      } else {
        unpairedCharacters.add(ch);
      }
    }

    // the string has a palindrome permutation if it
    // has one or zero characters without a pair
    return unpairedCharacters.size() <= 1;
  }

}

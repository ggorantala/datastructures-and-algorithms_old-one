package algorithms.strings;

import java.util.HashSet;

/**
 * This question is asked by Amazon. Given a string representing your stones and another string representing a list of jewels,
 * return the number of stones that you have that are also jewels.
 *
 * Ex: Given the following jewels and stones...
 *
 * If we imagined having these stones and jewels in front of us in real life, one way we could solve this problem is by picking
 * up a single stone at a time and comparing it to each and every stone. If the stone and the jewel match then we can increment our
 * count of how many jewels we have. The solution below represents this logic.
 * While this solution works, it is rather slow. For every single stone, we must iterate through every single jewel looking for a match.
 * To speed up this solution, we can leverage a hash set to eliminate the need for this additional linear scan through all of our jewels.
 * By throwing all of our jewels into a hash set we will be able to determine in O(1) (or constant) time whether the current stone at hand is
 * present in our jewels hash set. The improved solution utilizing this hash set is below.
 *
 * Big-O Analysis
 * Runtime: O(N + M) since we will need to iterate through all of our jewels to throw them into a hash set (let’s call it N jewels) and all of our stones to validate whether or not each one is a jewel (let’s call it M stones).
 * Space complexity: O(N) as we will throw each of our jewels into our hash set.
 */
public class JewelsAndStones {
  public static void main(String[] args) {
    System.out.println(jewelsHashMap("abc", "ac")); //return 2
    System.out.println(jewelsHashMap("Af", "AaaddfFf")); //return 3
    System.out.println(jewelsHashMap("AYOPD", "ayopd")); // return 0
  }

  private static int jewelsBruteForce(String jewels, String stones) {
    int count = 0;
    for (int i = 0; i < stones.length(); i++) {
      for (int j = 0; j < jewels.length(); j++) {
        if (stones.charAt(i) == jewels.charAt(j)) {
          count++;
        }
      }
    }
    return count;
  }

  private static int jewelsHashMap(String jewels, String stones) {
    HashSet<Character> jewelsSet = new HashSet<Character>();
    for (char c : jewels.toCharArray()) {
      jewelsSet.add(c);
    }

    int numJewels = 0;
    for (char c : stones.toCharArray()) {
      if (jewelsSet.contains(c)) {
        numJewels++;
      }
    }

    return numJewels;
  }
}

package algorithms.strings;

import java.util.HashMap;

/**
 * s = "foobar", t = "barfoot", return 't'
 * s = "ide", t = "idea", return 'a'
 * s = "coding", t "ingcod", return ''
 */
public class FirstUniqueCharacter {
  public static void main(String[] args) {
    System.out.println(firstUniqueChar("foobar", "barfoot"));
    System.out.println(firstUniqueChar("ide", "idea"));
    System.out.println(firstUniqueChar("coding", " "));
  }

  private static char firstUniqueChar(String S, String T){
    HashMap<Character, Integer> lookup = new HashMap<>();

    for(char ch : S.toCharArray()){
      lookup.put(ch, lookup.getOrDefault(ch, 0) + 1);
    }

    for(char ch : T.toCharArray()){
      if(!lookup.containsKey(ch)){
        return ch;
      }
    }
    return ' ';
  }
}

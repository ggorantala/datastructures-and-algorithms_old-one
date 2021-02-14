package algorithms.strings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ReverseWordsInString {
  public static void main(String[] args) {
    System.out.println(reverseWordsInString("tim is great!"));
  }

  private static String reverseWordsInString(String s) {
    ArrayList<String> strings = new ArrayList<>();

    int i = 0;
    for (int j = 0; j < s.length(); j++) {
      char character = s.charAt(j);
      if (character == ' ') {
        strings.add(s.substring(i, j));
        i = j;
      }else if(s.charAt(i) == ' '){
        strings.add(" ");
        i = j;
      }
    }
    strings.add(s.substring(i));
    Collections.reverse(strings);
    return String.join("", strings);
  }
}

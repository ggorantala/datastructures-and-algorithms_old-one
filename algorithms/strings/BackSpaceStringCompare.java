package algorithms.strings;

// # means backspace
public class BackSpaceStringCompare {
  public static void main(String[] args) {
//    System.out.println(typedOutStrings("ab#z", "az#z"));
//    System.out.println(typedOutStrings("acc#d", "acc#c"));

    System.out.println(typedOutStringsOptimal("ab##", "a#d#"));
//    System.out.println(typedOutStringsOptimal("acc#d", "acc#c"));
//    System.out.println(typedOutStringsOptimal("Acc#d", "acc#c"));
  }

  private static boolean typedOutStrings(String S, String T) {
    return buildString(S).equals(buildString(T));
  }

  private static String buildString(String str) {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < str.length() - 1; i++) {
      if (str.charAt(i) != '#' && str.charAt(i + 1) != '#') {
        sb.append(str.charAt(i));
      }
    }
    if (str.charAt(str.length() - 1) != '#') {
      sb.append(str.charAt(str.length() - 1));
    }
    return sb.toString();
  }

  private static boolean typedOutStringsOptimal(String S, String T) {
    //ab##   a#b#
    int p1 = S.length() - 1;
    int p2 = T.length() - 1;

    while (p1 >= 0 || p2 >= 0) {
      if (S.charAt(p1) == '#') {
        int p1Back = 2;

        while (p1Back-- > 0) {
          p1--;

          if (S.charAt(p1) == '#') {
            p1Back += 2;
          }
        }
      }

      if (T.charAt(p2) == '#') {
        int p2Back = 2;

        while (p2Back-- > 0) {
          p2--;

          if (T.charAt(p2) == '#') {
            p2Back += 2;
          }
        }
      }

      if (S.charAt(p1) != T.charAt(p2)) {
        return false;
      } else {
        p1--;
        p2--;
      }
    }

    return p1 == 0 && p2 ==0;
  }
}

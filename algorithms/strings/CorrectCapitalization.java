package algorithms.strings;

public class CorrectCapitalization {
  public static void main(String[] args) {
    System.out.println(correctCapitalization("USA"));
    System.out.println(correctCapitalization("Calvin"));
    System.out.println(correctCapitalization("compUter"));
    System.out.println(correctCapitalization("coding"));
  }

  private static boolean correctCapitalization(String str) {
    int length = Character.isUpperCase(str.charAt(0)) ? 1 : 0;

    for (int i = 1; i < str.length(); i++) {
      if (Character.isUpperCase(str.charAt(i))) {
        length++;
      }
    }
    return length == 0 || length == str.length() || length == 1 && Character.isUpperCase(str.charAt(0));
  }
}

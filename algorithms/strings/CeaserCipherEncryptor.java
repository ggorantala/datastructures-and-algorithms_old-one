package algorithms.strings;

public class CeaserCipherEncryptor {
  public static void main(String[] args) {
    System.out.println(ceaserCipherEncryptor("xyz", 2));
  }

  private static String ceaserCipherEncryptor(String str, int key) {
    char[] chars = new char[str.length()];

    for (int i = 0; i < str.length(); i++) {
      chars[i] = getNewChar(str.charAt(i), key);
    }
    return new String(chars);
  }

  private static char getNewChar(char ch, int key) {
    int count = ch + key;
    return count <= 122 ? (char) count : (char) (96 + count % 122);
  }
}

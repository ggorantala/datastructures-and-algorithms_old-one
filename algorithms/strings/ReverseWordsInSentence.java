package algorithms.strings;

public class ReverseWordsInSentence {
  public static void main(String[] args) {
    String str = "fwf wer ewr wer wer wer23r 23 432 324 r";
    System.out.println(reverseWords(str));
  }

  private static String reverseWords(String str){

    reverse(str.toCharArray(), 0, str.length());
    System.out.println(str);
    for(int i = 0, j = 0; i< str.length(); i++){
      if( str.charAt(j) == ' '){
        reverse(str.substring(i, j).toCharArray(), i , j - 1);
      }
    }
    return str;
  }

  private static String reverse(char[] chars, int i, int j){
    while(i < j){
      char ch = chars[i];
      chars[i++] = chars[j];
      chars[j--] = ch;
    }
    return new String(chars);
  }
}

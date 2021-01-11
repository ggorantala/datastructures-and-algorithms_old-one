package algorithms.strings;

public class RunLengthEncoding {
  public static void main(String[] args) {
    System.out.println(runLengthEncoding("AAAAAAAAAAAAABBCCCCDD"));
  }

  private static String runLengthEncoding(String str){
    StringBuilder sb = new StringBuilder();

    int length = 1, i = 1;

    for(; i < str.length(); i++){
      if(str.charAt(i) == str.charAt(i-1) && length < 9){
        length++;
      }else{
        sb.append(length).append(str.charAt(i-1));
        length = 1;
      }
    }

    sb.append(length).append(str.charAt(i-1));
    return sb.toString();
  }
}

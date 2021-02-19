package algorithms.greedy;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class ClassPhotos {
  public static void main(String[] args) {
    ArrayList<Integer> redShirts = new ArrayList<>(Arrays.asList(5, 8, 1, 3, 4));
    ArrayList<Integer> blueShirts = new ArrayList<>(Arrays.asList(6, 4, 2, 4, 5));
    System.out.println(classPhotos(redShirts, blueShirts));
  }

  private static boolean classPhotos(ArrayList<Integer> redShirts, ArrayList<Integer> blueShirts){

    Collections.sort(redShirts, Collections.reverseOrder());
    Collections.sort(blueShirts, Collections.reverseOrder());

    String colorInFirstRow = redShirts.get(0) < blueShirts.get(0) ? "Red" : "Blue";

    for(int i = 0 ; i < redShirts.size(); i++){
      int redShirtHeight = redShirts.get(i);
      int blueShirtHeight = blueShirts.get(i);

      if(colorInFirstRow.equals("Red")){
        if(redShirtHeight >= blueShirtHeight){
          return false;
        }
      }else {
        if(redShirtHeight <= blueShirtHeight){
          return false;
        }
      }
    }
    return true;
  }
}

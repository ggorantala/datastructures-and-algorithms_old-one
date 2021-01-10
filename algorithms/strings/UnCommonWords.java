package algorithms.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * sentence1 = ", sentence2 = "brown fox", return ["the", "quick", "brown", "fox"]
 * sentence1 = "the tortoise beat the haire", sentence2 = "the tortoise lost to the haire", return ["beat", "to", "lost"]
 * sentence1 =  return ["copper", "hot"]
 */
public class UnCommonWords {
  public static void main(String[] args) {
    System.out.println((uncommonArray("the quick", "brown fox")));
    System.out.println((uncommonArray("the tortoise beat the haire", "the tortoise lost to the haire")));
    System.out.println((uncommonArray("copper coffee pot", "hot coffee pot")));
  }

  private static List<String> uncommonArray(String str1, String str2) {
    List<String> strs = new ArrayList<>();
    HashMap<String, Boolean> lookup = new HashMap<>();
    for(String str: str1.split(" ")){
      lookup.put(str, true);
    }

    for(String str: str2.split(" ")){
      if(lookup.containsKey(str)){
        lookup.put(str, false);
      }else{
        lookup.put(str, true);
      }
    }

    for( String str: lookup.keySet()){
      strs.add(str);
    }
    return strs;
  }
}

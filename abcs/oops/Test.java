package abcs.oops;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        //count the words
        //repeated words in the string and count;

        String str = "My clients wrote a strong offer over list price with no contingencies. The seller received over 10 other offers and decided to take the highest and best offer without sending any counter offers";

        HashMap<String, Integer> map = new HashMap<>();
        String[] strs = str.split(" ");
        System.out.println("Word Count: " + strs.length);
        for (String s : strs) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        System.out.println(map);
    }
}

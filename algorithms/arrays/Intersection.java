package algorithms.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Intersection {
//  nums1 = [2, 4, 4, 2], nums2 = [2, 4], return [2, 4]
//  nums1 = [1, 2, 3, 3], nums2 = [3, 3], return [3]
//  nums1 = [2, 4, 6, 8], nums2 = [1, 3, 5, 7], return []

  public static void main(String[] args) {
    System.out.println(intersection(new int[]{2, 4, 4, 2}, new int[]{2, 4}));
    System.out.println(intersection(new int[]{1, 2, 3, 3}, new int[]{3, 3}));
    System.out.println(intersection(new int[]{2, 4, 6, 8}, new int[]{1, 3, 5, 7}));
  }

  public static List<Integer> intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> set = new HashSet<Integer>();
    for (int i : nums1) {
      set.add(i);
    }

    List<Integer> intersection = new ArrayList<Integer>();
    for (int i = 0; i < nums2.length; i++) {
      if (set.contains(nums2[i])) {
        intersection.add(nums2[i]);
        set.remove(nums2[i]);
      }
    }

    return intersection;
  }


}



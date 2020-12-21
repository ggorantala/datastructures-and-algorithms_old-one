package algorithms.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BranchSums {
  public static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }

  public static List<Integer> branchSums(BinaryTree root) {
    List<Integer> ans = new ArrayList<>();
    calSumOfBranches(root, 0, ans);
    return ans;
  }

  public static void calSumOfBranches(BinaryTree root, int sum, List<Integer> ans){
    if(root == null){
      return;
    }

    int nSum = sum + root.value;
    if(root.left == null && root.right == null){
      ans.add(nSum);
      return;
    }

    calSumOfBranches(root.left, nSum, ans);
    calSumOfBranches(root.right, nSum, ans);
  }
}

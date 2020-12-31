package algorithms.linkedlist;

public class AddTwoNumbers {
  static class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode sentinel = null;

      int carry = 0;
      while(l1!= null || l2 != null){
        int sum = carry;
        if(l1 != null){
          sum += l1.val;
        }

      }
      return sentinel;
    }
  }
}
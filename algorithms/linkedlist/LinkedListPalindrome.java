package algorithms.linkedlist;

public class LinkedListPalindrome {
  public boolean linkedListPalindrome(LinkedList head) {
    LinkedList slow = head;
    LinkedList fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return isPalindrome(head, slow);
  }

  public boolean isPalindrome(LinkedList head, LinkedList newHead) {
    LinkedList slowRev = reverse(newHead);

    while (slowRev != null) {
      if (head.value != slowRev.value) {
        return false;
      }
      head = head.next;
      slowRev = slowRev.next;
    }
    return true;
  }

  public LinkedList reverse(LinkedList head) {
    LinkedList prev = null;
    LinkedList curr = head;

    while (curr != null) {
      LinkedList next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    return prev;
  }

  // This is an input class. Do not edit.
  public static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }
}

package algorithms.arrays;

import java.util.Arrays;

public class CafeOrderChecker {


  public static void main(String[] args) {
    int[] takeOutOrders = {1, 3, 5};
    int[] dineInOrders = {2, 4, 6};
    int[] servedOrders = {1, 2, 4, 6, 5, 3};

    System.out.println(isFirstComeFirstServed(takeOutOrders, dineInOrders, servedOrders));
  }

  private static boolean isFirstComeFirstServed02(int[] takeOutOrders, int[] dineInOrders, int[] servedOrders) {
    return isFirstComeFirstServed02(takeOutOrders, dineInOrders, servedOrders, 0, 0, 0);
  }

  private static boolean isFirstComeFirstServed02(int[] takeOutOrders, int[] dineInOrders, int[] servedOrders,
                                                  int servedOrdersIndex, int takeOutOrdersIndex, int dineInOrdersIndex) {
    // base case we've hit the end of servedOrders
    if (servedOrdersIndex == servedOrders.length) {
      return true;
    }

    // if we still have orders in takeOutOrders
    // and the current order in takeOutOrders is the same
    // as the current order in servedOrders
    if ((takeOutOrdersIndex < takeOutOrders.length)
      && (takeOutOrders[takeOutOrdersIndex] == servedOrders[servedOrdersIndex])) {
      takeOutOrdersIndex++;

      // if we still have orders in dineInOrders
      // and the current order in dineInOrders is the same
      // as the current order in servedOrders
    } else if ((dineInOrdersIndex < dineInOrders.length)
      && (dineInOrders[dineInOrdersIndex] == servedOrders[servedOrdersIndex])) {
      dineInOrdersIndex++;

      // if the current order in servedOrders doesn't match
      // the current order in takeOutOrders or dineInOrders, then we're not
      // serving in first-come, first-served order.
    } else {
      return false;
    }

    // the current order in servedOrders has now been "accounted for"
    // so move on to the next one
    servedOrdersIndex++;
    return isFirstComeFirstServed02(takeOutOrders, dineInOrders, servedOrders, servedOrdersIndex, takeOutOrdersIndex, dineInOrdersIndex);
  }

  private static boolean isFirstComeFirstServed(int[] takeOutOrders, int[] dineInOrders, int[] servedOrders) {

    // base case
    if (servedOrders.length == 0) {
      return true;
    }

    // if the first order in servedOrders is the same as the
    // first order in takeOutOrders
    // (making sure first that we have an order in takeOutOrders)
    if (takeOutOrders.length > 0 && takeOutOrders[0] == servedOrders[0]) {

      // take the first order off takeOutOrders and servedOrders and recurse
      return isFirstComeFirstServed(removeFirstOrder(takeOutOrders), dineInOrders, removeFirstOrder(servedOrders));

      // if the first order in servedOrders is the same as the first
      // in dineInOrders
    } else if (dineInOrders.length > 0 && dineInOrders[0] == servedOrders[0]) {

      // take the first order off dineInOrders and servedOrders and recurse
      return isFirstComeFirstServed(takeOutOrders, removeFirstOrder(dineInOrders), removeFirstOrder(servedOrders));

      // first order in servedOrders doesn't match the first in
      // takeOutOrders or dineInOrders, so we know it's not first-come, first-served
    } else {
      return false;
    }
  }

  private static int[] removeFirstOrder(int[] orders) {
    return Arrays.copyOfRange(orders, 1, orders.length);
  }
}

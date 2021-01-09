package greedy;

public class AppleStocks {
  public static void main(String[] args) {
    int[] stockPrices = new int[]{10, 7, 5, 8, 11, 9};

    System.out.println(getMaxprofit(stockPrices));
// returns 6 (buying for $5 and selling for $11)
  }

  private static int getMaxprofit(int[] stockPrices) {
    int minPrice = stockPrices[0];
    int maxProfit = 0;

    for (int currentPrice : stockPrices) {

      // ensure minPrice is the lowest price we've seen so far
      minPrice = Math.min(minPrice, currentPrice);

      // see what our profit would be if we bought at the
      // min price and sold at the current price
      int potentialProfit = currentPrice - minPrice;

      // update maxProfit if we can do better
      maxProfit = Math.max(maxProfit, potentialProfit);
    }

    return maxProfit;
  }
}

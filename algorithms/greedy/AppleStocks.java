package algorithms.greedy;

public class AppleStocks {
  public static void main(String[] args) {
    int[] stockPrices = new int[]{10, 7, 5, 8, 11, 9};

    System.out.println(getMaxProfitBruteForce(stockPrices));
    System.out.println(getMaxProfit01(stockPrices));
    System.out.println(getMaxprofit(stockPrices));
// returns 6 (buying for $5 and selling for $11)
  }

  public static int getMaxProfitBruteForce(int[] stockPrices) {
    int maxProfit = 0;

    // go through every price and time
    for (int earlierTime = 0; earlierTime < stockPrices.length; earlierTime++) {
      int earlierPrice = stockPrices[earlierTime];

      // and go through all the LATER prices
      for (int laterTime = earlierTime + 1; laterTime < stockPrices.length; laterTime++) {
        int laterPrice = stockPrices[laterTime];

        // see what our profit would be if we bought at the
        // min price and sold at the current price
        int potentialProfit = laterPrice - earlierPrice;

        // update maxProfit if we can do better
        maxProfit = Math.max(maxProfit, potentialProfit);
      }
    }

    return maxProfit;
  }

  private static int getMaxProfit01(int[] stockPrices){
    int min = stockPrices[0];
    int profit = 0;

    for(int i = 1; i< stockPrices.length; i++){
      if(stockPrices[i] < min){
        min = stockPrices[i];
      }else{
        profit = Math.max(profit, stockPrices[i] - min);
      }
    }
    return profit;
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

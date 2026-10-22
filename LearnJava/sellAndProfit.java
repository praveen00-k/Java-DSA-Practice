import java.util.Arrays;
public class sellAndProfit {
  public static int maxProfitStock(int[] stock)
  {
    if(stock == null || stock.length == 0)
    {
      return -1;
    } 

    int lowestPrice = stock[0];
    int bestPrice = 0;

    for(int i = 1; i < stock.length; i++)
    {
      int profit = stock[i] - lowestPrice;

      if(profit > bestPrice)
      {
        bestPrice = profit;
      }

      if(stock[i] < lowestPrice)
      {
        lowestPrice = stock[i];
      }
    }
    return bestPrice;
  }

  public static int maxProfit(int[] prices)
  {
      int bestProfit = 0;

      for (int buyDay = 0; buyDay < prices.length - 1; buyDay++) 
      {
        for (int sellDay = buyDay + 1; sellDay < prices.length; sellDay++)
        {
          int profit = prices[sellDay] - prices[buyDay];

          if (profit > bestProfit)
          {
            bestProfit = profit;
          }
        }
      }
    return bestProfit;
    }
  public static void main(String[] args) {
    int [] stock = {12,15,27,84,76};
    System.out.println(maxProfitStock(stock));
    System.out.println(maxProfit(stock));
  }
}

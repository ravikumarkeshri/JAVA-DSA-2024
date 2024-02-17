package LeetCodeProblems;

public class BuySellStocks {
    public static int maxProfit(int[] prices) {
      int minPrice = Integer.MAX_VALUE;
      int maxProfit = 0;
      for(int price :prices){
        if(price<minPrice){
            minPrice = price;
        }else if(price - minPrice> maxProfit){
            maxProfit = price-minPrice;
        }
      }
      return maxProfit;
       
      

        
      
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(prices));

    }
}

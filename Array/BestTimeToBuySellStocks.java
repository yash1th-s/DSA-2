package Array;

public class BestTimeToBuySellStocks {

    public static int maxProfit(int prices[]){
        int maxProfit = 0, minPrice = prices[0];
        for(int i=0; i<prices.length;i++){
            maxProfit = Math.max(maxProfit, prices[i]-minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4, 10};
        System.out.println(maxProfit(prices));
    }
    
}

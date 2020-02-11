package easy;

public class BestTimetoBuyandSellStock {
	public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};      
        System.out.println("First approach "+ maxProfit(prices));
        System.out.println("Second approach "+ maxProfit2(prices));
	}
	//First solution
	public static int maxProfit(int[] prices) {
		int min_val = Integer.MAX_VALUE;
		int max_profit = 0;
		for(int i=0;i<prices.length;i++) {
			if(prices[i] < min_val) {
				min_val = prices[i];
			}else if(prices[i] - min_val > max_profit) {
				max_profit = prices[i] -min_val;
			}
		}
		return max_profit;
	}
	//second solution
	public static int maxProfit2(int[] prices) {
		int min = Integer.MAX_VALUE;
		int max = 0;
		for(int i=0;i<prices.length;i++) {
			if(prices[i] < min) {
				min = prices[i];
			}else { 
				max = Math.max(max,prices[i] - min);
			}
		}
		return max;
	}
}

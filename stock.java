package LEETCODE;

public class stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static int maxProfit(int[] prices) {
		int min=Integer.MAX_VALUE;
		int maxp=0;
		int profit=0;
		for(int i=0;i<prices.length;i++) {
			if(prices[i]<min) {
				min=prices[i];
			}
		profit=prices[i]-min;
		if(profit<0) {
			profit=0;
		}
		maxp=Math.max(maxp, profit);
		}
		return maxp;
	 }
}
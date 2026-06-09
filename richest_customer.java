package LEETCODE;

public class richest_customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int acc[][]= {{1,2,3},{1,2,3}};
		System.out.println(maximumWealth(acc));

	}
	public static int maximumWealth(int[][] accounts) {
		int i=0;
		int max=0;
		while(i<accounts.length) {
			int total=0;
			 int j=0;
			while(j<accounts[i].length) {
				total=total+accounts[i][j];
				j++;
			}
			i++;
			max=Math.max(total, max);
		}
		return max;
	}
}

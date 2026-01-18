package LEETCODE;

public class Even_Number_Of_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {12,345,2,6,7896};
System.out.println(findNumbers(arr));
	}
	public static int findNumbers(int[] nums) {
		int total=0;
	
		for(int i=0;i<nums.length;i++) {
		
			int digits=digits(nums[i]);
	if(digits%2==0) {
		total++;
	}
		}
	return total;
		}
	public static int digits(int n) {
		int digits=0;
		while(n>0) {
			n=n/10;
			digits++;
		}
		return digits;
	}
}

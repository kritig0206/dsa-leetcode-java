package LEETCODE;

public class pivot_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {2,1,-1};
System.out.println(pivotIndex(arr));
	}
	public static int pivotIndex(int[] nums) {
		int sumR=0;
		int sumL=0;
		for(int i=0;i<nums.length;i++) {
			sumR=SumR(nums,i);
			sumL=SumL(nums,i);
			if(sumR==sumL) {
				return i;
			}
		}
		return -1;
	}
	public static int SumR(int[] nums,int j) {
		int sum=0;
		for(int i=0;i<j;i++) {
			sum=sum+nums[i];
		}
		return sum;
	}
	public static int SumL(int[] nums,int j) {
		int sum=0;
		for(int i=j+1;i<nums.length;i++) {
			sum=sum+nums[i];
		}
		return sum;
	}
}

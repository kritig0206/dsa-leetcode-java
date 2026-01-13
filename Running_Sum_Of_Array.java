package LEETCODE;

public class Running_Sum_Of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 1, 1, 1, 1 };
		int nums[] = sum(arr);
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
	}

	public static int[] sum(int[] arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			arr[i]=sum;
		}
return arr;
	}
}

package LEETCODE;

import java.util.Arrays;

public class Missing_Number {

	public static void main(String[] args) {
		// TOint DO Auto-generated method 
int arr[]= {3,0,1};
System.out.println(missingNumber(arr));

	}
	 public static int missingNumber(int[] nums) {
		 Arrays.sort(nums);
		 int i=0;
		 int n=nums.length;
		 while(i<n) {
			 if(nums[i]!=i) {
				 
				 return i;
			 }
			 i++;
		 }
		 return n;
	 }
}

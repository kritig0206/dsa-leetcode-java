package LEETCODE;

public class Two_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {3,2,4};
		int target = 6;
		int arr[]=new int[2];
		arr=twoSum(nums,target);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	 public static int[] twoSum(int[] nums, int target) {
		 int arr[]=new int[2];
	     for(int i=0;i<nums.length;i++) {
	    	 for(int j=i;j<nums.length;j++) {
	    		 if(nums[i]+nums[j]==target) {
	    			 arr[0]=i;
	    			 arr[1]=j;
	    		 }
	    	 }
	     }
	        return arr;
	    }
}

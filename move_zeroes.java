package LEETCODE;

public class move_zeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 0, 1, 0, 3, 12 };
		moveZeroes(nums);
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}

	}

	public static void moveZeroes(int[] nums) {
	         int i;
			 int k=0;
				for(i=0;i<nums.length;i++) {
					if(nums[i]!=0) {
						nums[k]=nums[i];
						k++;
					}
				}
				while(k<nums.length) {
					nums[k]=0;
					k++;
				}
			
		 }
			  }
		  
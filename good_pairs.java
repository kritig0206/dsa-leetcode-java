package LEETCODE;

public class good_pairs {
	public static void main(String[] args) {
		int nums[]= {1,2,3,1,1,3};
		System.out.println(number(nums));

	}
	public static int number(int []nums) {
		int count = 0;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					count++;
				}
			}
		}
		return count;
	}
}

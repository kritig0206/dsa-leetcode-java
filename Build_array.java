package LEETCODE;

public class Build_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 0, 2, 1, 5, 3, 4 };
		int ans[] = build_array(nums);
		for(int i=0;i<nums.length;i++) {
			System.out.print(ans[i]+" ");
		}

	}

	public static int [] build_array(int[]nums) {
		int ans[]= new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			ans[i] = nums[nums[i]];
		}
return ans;
	}
}

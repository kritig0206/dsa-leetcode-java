package LEETCODE;

public class Concatenation_of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 1 };

	}

	public static int[] concatenation(int nums[]) {
		int arr[] = new int[2 * nums.length];
		for (int i = 0; i < nums.length; i++) {
			arr[i] = nums[i];
			arr[i + nums.length] = nums[i];
		}
		return arr;
	}

}

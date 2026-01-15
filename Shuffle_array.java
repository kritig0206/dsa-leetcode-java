package LEETCODE;

public class Shuffle_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 5, 1, 3, 4, 7 };
		int n = 3;
		arr=shuffle_arr(arr,3);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static int[] shuffle_arr(int nums[], int n) {
		int ans[] = new int[nums.length];
		int k=0;
		  for (int i = 0; i < n; i++) {
		        ans[k] = nums[i];
		        k++;
		        ans[k] = nums[i + n];
		        k++;
		    }	
			
		return ans;
	}
}

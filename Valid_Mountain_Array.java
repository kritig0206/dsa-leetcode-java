package LEETCODE;

public class Valid_Mountain_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, 3, 2, 1 };
		System.out.println(validMountainArray(arr));

	}

	public static boolean validMountainArray(int[] arr) {
		if (arr.length <= 3) {
			return false;
		}
		int max = Integer.MIN_VALUE;
		int maxidx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				maxidx = i;
			}
		}
		for(int i=0;i<maxidx;i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}
		}
		for(int j=maxidx;j<arr.length-1;j++) {
			if(arr[j]<arr[j+1]) {
				return false;
			}
		}
		return true;
	}
}
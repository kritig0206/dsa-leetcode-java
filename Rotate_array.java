package LEETCODE;

public class Rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int k=2;
		rotate_array(arr,k);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}
	public static void Reverse_Array(int arr[],int i,int j) {

		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
			}
	public static void rotate_array(int []nums,int k) {
		Reverse_Array(nums,0,nums.length-1);
		Reverse_Array(nums,0,k-1);
		Reverse_Array(nums,k,nums.length-1);
		
	}
}

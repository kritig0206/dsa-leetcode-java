package LEETCODE;

import java.util.Scanner;

public class check_double {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(checkIfExist(arr));
	}
	public static boolean checkIfExist(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==2*arr[i]) {
					return true;
				}
			}
		}
		return false;
	}
}

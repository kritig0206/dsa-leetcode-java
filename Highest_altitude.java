package LEETCODE;

import java.util.Scanner;

public class Highest_altitude {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(largestAltitude(arr));
	}
	public static int largestAltitude(int[] gain) {
		int altitude=0;
		int highest=0;
		for(int i=0;i<gain.length;i++) {
			altitude=altitude+gain[i];
			if(altitude>highest) {
				highest=altitude;
			}
		}
		return highest;
	}
}

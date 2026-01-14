package LEETCODE;

import java.util.*;

public class kids_candies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 5, 1, 3 };
		int extra = 3;
		boolean candies[]=kidswithcandies(arr,extra);
		for(int i=0;i<arr.length;i++) {
			System.out.print(candies[i]+" ");
		}

	}

	public static int max(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static boolean[] kidswithcandies(int candies[], int extra) {
//adding extra candies
		
		boolean arr[] = new boolean[candies.length];
		   int maximum = max(candies);   // find max ONCE

	        for (int i = 0; i < candies.length; i++) {
	            if (candies[i] + extra >= maximum) {
	                arr[i] = true;
	            } else {
	                arr[i] = false;
	            }
	        }
	        return arr;
	}

}

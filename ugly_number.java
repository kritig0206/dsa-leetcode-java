package LEETCODE;

import java.util.Scanner;

public class ugly_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		  if (n <= 0) {
			 System.out.println(false);
		  }
		  while (n % 2 == 0){ n /= 2;}
	        while (n % 3 == 0){ n /= 3;}
	        while (n % 5 == 0){ n /= 5;}
	        System.out.println(n==1);
	}

}

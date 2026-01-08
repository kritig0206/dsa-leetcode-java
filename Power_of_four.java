package LEETCODE;

import java.util.Scanner;

public class Power_of_four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		if(num<=0) {
			System.out.println(false);
		}while(num%4==0) {
			num=num/4;
		}
		System.out.println(num==1);
	}

}

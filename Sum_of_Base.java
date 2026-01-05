package LEETCODE;

import java.util.Scanner;

public class Sum_of_Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int num=conversion(n,k);
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
	}
public static int conversion(int n,int k) {
	int num=0;
	int mul=1;
	while(n>0) {
		int rem=n%k;
		num=num+mul*rem;
		mul=mul*10;
		n=n/k;
	}
return num;
}
}

package LEETCODE;
import java.util.*;
public class Perfect_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println(PerfectNumber(n));
	}
public static boolean PerfectNumber(int n) {
	if(n<0) {
		return false;
	}
	int sum=1;
	for(int i=2;i<=n-1;i++) {
		if(n%i==0) {
			sum=sum+i;
		}
	}
	if(sum==n) {
		return true;
	}
	return false;
}
}

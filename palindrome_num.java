package LEETCODE;
import java.util.*;
public class palindrome_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int rev= reverse(n);
if(rev==n) {
	System.out.println("true");
}else {
	System.out.println("false");
}
	}
public static int reverse(int n) {
	int rev=0;
	while(n>0) {
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	return rev;
}
}

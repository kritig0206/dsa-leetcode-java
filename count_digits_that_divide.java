package LEETCODE;
import java.util.*;

public class count_digits_that_divide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int n = sc.nextInt();
int temp=n;
int count=0;
while(n>0) {
	int digit=n%10;
	if(temp%digit==0) {
		count++;
	}
	n=n/10;
}
System.out.println(count);
	}

}

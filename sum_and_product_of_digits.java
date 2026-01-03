package LEETCODE;
import java.util.*;
public class sum_and_product_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=0;
int product=1;
Scanner sc= new Scanner(System.in);
int n= sc.nextInt();
while(n>0) {
	int digit=n%10;
	sum=sum+digit;
	product=product*digit;
	n=n/10;
}
System.out.println(product-sum);
	}

}

package leetcode;

public class Fibonacci_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		System.out.println(fib(n));
	}

	public static int fib(int n) {

if(n==0) {
	return 0;
}
if(n==1) {
	return 1;
}
return fib(n-1)+fib(n-2);
	}
}

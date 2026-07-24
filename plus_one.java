package leetcode;

public class plus_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digits[]= {1,2,3};
System.out.println(plus_one(digits));
	}

	public static int[] plus_one(int[] digits) {
		int num=0;
		for(int i=0;i<digits.length;i++) {
			num=num*10+digits[i];
		}
		num=num+1;
		int n=num;
		int count=0;
		while(num>0) {
			num=num%10;
			count++;
		}
		int arr[]= new int [count];
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=n%10;
		}
		return arr;
	}
}

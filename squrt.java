package LEETCODE;

public class squrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=8;
System.out.println(BinarySearch(x));
	}
	public static int BinarySearch(int x) {
		int low=0;
		int high=x;
int mid=0;
		while(low<high) {
			mid=(low+high)/2;
			if(mid==x/mid) {
			return mid;
			}else if(mid>x/mid) {
				high=mid-1;
			}else {
				low=mid+1;
		}
			}
		return high;
}
}

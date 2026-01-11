package LEETCODE;
import java.util.*;
public class Valid_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n= sc.nextInt();
System.out.println(Valid_Num(n));
	}
public static boolean Valid_Num(int num) {
	
	if (num < 1) return false;

    long low = 1;
    long high = num;

    while (low <= high) {
        long mid = low + (high - low) / 2;
        long sq = mid * mid;

        if (sq == num) {
            return true;
        } 
        else if (sq < num) {
            low = mid + 1;
        } 
        else {
            high = mid - 1;
        }
    }

    return false;
}
}


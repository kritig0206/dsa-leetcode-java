package LEETCODE;

import java.util.*;

public class power_of_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 0; i < 31; i++) {
			if ((int) Math.pow(2, i) == n) {
				count++;
				break;
			}
		}
		if(count>=1) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
}

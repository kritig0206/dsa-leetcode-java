package Lec12;

import java.util.Scanner;

public class Reverse_words_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// String s=sc.nextLine();
		String s = " hello world ";
		System.out.println(s.trim());
		System.out.println(reverse_Words(s));
	}

	public static String reverse_Words(String s) {
		s = s.trim();
String[] arr=s.split("\s+");
String ans="";
for(int i=arr.length-1;i>=0;i--) {
	ans=ans+arr[i]+" ";
}
return ans.trim();
	}
}

package leetcode;

public class longest_possible_prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String []strs= {"flower","flow","flight"};

	}
	public static String longest_possible_prefix(String strs[]) {
		int len=minimum(strs);
		String ans="";
		for(int i=0;i<len;i++) {
			if(strs[0].charAt(i)==strs[1].charAt(i) && strs[0].charAt(i)==strs[2].charAt(i)) {
				ans=ans+strs[0].charAt(i);
			}
			
		}
		return ans;
				}
	public static int minimum(String strs[]) {
		int min=0;
		for(int i=0;i<strs.length;i++) {
			if(strs[i].length()<strs[i+1].length()) {
				min=strs[i].length();
			}
		}
		return min;
	}
}

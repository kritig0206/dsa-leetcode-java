package leetcode;

public class Shuffle_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="codeleet";
int indices[]= {4,5,6,7,0,2,1,3};
System.out.println(restoreString(s,indices));
	}
	  public static String restoreString(String s, int[] indices) {
		  char[] ans = new char[s.length()];

		  for (int i = 0; i < s.length(); i++) {
			  ans[indices[i]] = s.charAt(i);
		      // put the ith character at its correct position
		  }

		  return new String(ans);
	  }
}

package leetcode;

public class merge_strings_alternatively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(mergeAlternately("abc","pqrst"));
	}
	public static String mergeAlternately(String word1, String word2) {
		int len=Math.min(word1.length(), word2.length());
		String str="";
		for(int i=0;i<len;i++) {
			str=str+word1.charAt(i)+word2.charAt(i);
		}
		
		if (word2.length() > word1.length()) {
		    int j = len;
		    while (j < word2.length()) {
		        str += word2.charAt(j);
		        j++;
		    }
		}
		if (word1.length() > word2.length()) {
		    int j = len;
		    while (j < word1.length()) {
		        str += word1.charAt(j);
		        j++;
		    }
		}

		return str;
	}
        
}

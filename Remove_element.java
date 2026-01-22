package LEETCODE;

public class Remove_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums[]= {3,2,2,3};
int val=3;
System.out.println(removeElement(nums,val));


	}
	 public static int removeElement(int[] nums, int val) {
		 int i=0;
		 int k=0;
		 while(i<nums.length) {
			 if(nums[i]==val) {
				 i++;
			 }else {
				 k++;
				 i++;
			 }
		 }
		 return k;
	 }
}

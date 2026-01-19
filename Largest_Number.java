package LEETCODE;

public class Largest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {3,6,1,0};
System.out.println(dominantIndex(arr));

	}
	  public static int dominantIndex(int[] nums) {
		  int maxidx=maxIndex(nums);
		  for(int i=0;i<nums.length;i++) {
			  if(i==maxidx) {
				  continue;
			  }
			  if(nums[maxidx]<2*nums[i]) {
				  return -1;
			  }
			  
		  
		  }
		  return maxidx;
	  }
	  public static int maxIndex(int []nums) {
		  int max=nums[0];
		  int idx=0;
		  for(int i=1;i<nums.length;i++) {
			  if(nums[i]>max) {
				  max=nums[i];
				  idx=i;
			  }
		  }
		  return idx;
	  }
}

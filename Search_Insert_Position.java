package LEETCODE;

public class Search_Insert_Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public static int Insert_position(int []nums,int target) {
	   int low=0;
	   int high=nums.length-1;
	   int ans1=-1;
	   int ans2=-1;
	   while(low<high) {
	   	int mid=(low+high)/2;
	   	if(nums[mid]==target) {
	   	  return mid;
	   	}else if(nums[mid]<target){
	        ans1=mid;
	   		low=mid+1;
	   	}else {
	           ans2=mid;
	   		high=mid-1;
	   	} 
	   }
 	if(target-ans1>ans2-target) {
	   		return ans2;
	   	}else {
	   		return ans1;
	   	}

}
}

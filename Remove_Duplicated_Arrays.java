package LEETCODE;

public class Remove_Duplicated_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,1,2};
System.out.println( Remove_Duplicates(arr));
	}

	
		public static int Remove_Duplicates(int[] nums) {
			int k=1;
			int i=1;
			
	while(i<nums.length) {
		if(nums[i]==nums[k-1]) {
			i++;
		}else {		
			nums[k]=nums[i];
			k++;
			i++;
		}
	}
	
	return k;
	}
	}
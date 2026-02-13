package Basics;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,3,5,7,19};
System.out.println(BinarySearch(arr,7));
	}

	public static int BinarySearch(int arr[], int target) {
int low=0;
int high=arr.length-1;

while(low<high) {
	int mid=(low+high)/2;
	if(arr[mid]==target) {
	  return mid;
	}else if(arr[mid]<target){
		low=mid+1;
	}else {
		high=mid-1;
	}

}
return -1;
	}
}

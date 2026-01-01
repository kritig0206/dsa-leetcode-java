package LEETCODE;
import java.util.*;
public class No_of_steps_to_reduce_to_zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int num= sc.nextInt();
int step=0;
if(num==0) {
	System.out.println("0");
}else {
while(num>0) {
	if(num%2==0) {
		num=num/2;
		step++;
	}else {
		num=num-1;
		step++;
		if(num==0) {
			break;
		}
	}
}

System.out.println(step);
	}
	}
}

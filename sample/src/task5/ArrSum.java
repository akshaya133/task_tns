package task5;
import java.util.*;
public class ArrSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr=new int[6];
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10);
			System.out.println(arr[i]+" ");
			sum=sum+arr[i];
		}
		System.out.println("sum is "+sum);
	}

}

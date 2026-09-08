package task5;
import java.util.*;
public class CountEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		int c=1;
		System.out.println(" array eles are :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10);
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			
			if(i<arr.length-1 && arr[i]==arr[i+1]) {
				
				c++;
			}
			else {
				System.out.println("arr ele is :"+arr[i]+" count is "+c);
				c=1;
			}
		}
		

	}

}

package task5;

public class EvenOddEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		int[] even=new int[10];
		int[] odd=new int[10];
		int x=0;
		int y=0;
		System.out.println("Elements in array are :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10);
			System.out.print(arr[i]+" ");
			
			if(arr[i]%2==0) {
				even[x]=arr[i];
				x++;
			
			}
			else {
				odd[y]=arr[i];
				y++;
				
			}
			
		}
		System.out.println();
		System.out.println("even nums are :");
		for(int j=0;j<x;j++) {
			System.out.print(even[j]+" ");
			
		}
		System.out.println();
		System.out.println("Odd nums are :");
		for(int k=0;k<y;k++) {
			System.out.print(odd[k]+" ");
		}
		
	}

}

package task5;

public class SortArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		System.out.println("Befeore sorting array is ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10);
			System.out.print(arr[i]+" ");
			
			
		}
		System.out.println();
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println("After sorting an array is ");
		for(int i=0;i<arr.length;i++) {
System.out.print(arr[i]+" ");
		}
	}

}

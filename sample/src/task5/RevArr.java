package task5;

public class RevArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[7];
		int[] rev=new int[7];
		System.out.println("original array elements are: ");
	
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10);
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		System.out.println("rev of arr :");
		for(int i=arr.length-1;i>=0;i--) {
			rev[i]=arr[i];
			System.out.print(rev[i]+" ");
		}
	}

}

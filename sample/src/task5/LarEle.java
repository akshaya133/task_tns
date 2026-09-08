package task5;

public class LarEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[7];
		int l=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10);
			System.out.println(arr[i]+" ");
			if(arr[i]>l) {
				l=arr[i];
			}
			
			
		}
		System.out.println("lar num is "+l);

	}

}

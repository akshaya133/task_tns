package task2;

public class FiboNum {

	public static void main(String[] args) {
		int n=5;
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<=n;i++) {
		
			int c=a+b;
			a=b;
			b=c;
			
		
		System.out.println(c);
		}
		// TODO Auto-generated method stub

	}

}

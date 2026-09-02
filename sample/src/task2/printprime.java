package task2;

public class printprime {
	
	int num=100;
	public void call() {
		
		for(int i=2;i<=100;i++) {
			boolean ispri=true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					ispri=false;
					break;
				}
			}
		
		if(ispri) {
			System.out.print(i+" ");
		}
		}
	}

}

package task2;

public class SumOfPrime {
	public static void main(String args[]) {
	int n=10;
	int sum=0;
	
	if(n<=1) {
		return;
	}
	for(int i=2;i<=n;i++) {
		boolean ispri=true;
		for(int j=2;j<i;j++) {
		if(i%j==0) {
			ispri=false;
			break;
		}
		}
		
		if(ispri) {
			sum=sum+i;
			
		}
			
	}
		System.out.println(sum);
	
	
	}

}

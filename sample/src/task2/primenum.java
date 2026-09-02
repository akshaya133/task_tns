package task2;

public class primenum {
	int num=2;
	public void isprime() {
		boolean ispri=true;
		if(num<=1) {
			System.out.println("is not prime number");
		}
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				ispri=false;
				break;
			}
			
		}
		if(ispri) {
			System.out.println(num+" is prime");
		}
		else {
			System.out.println(num+" not a prime");
		}
	}

}

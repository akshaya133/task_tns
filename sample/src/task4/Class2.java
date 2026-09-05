package task4;

public class Class2 {
	int a=38, b=44;
	Class2(){
		this.a=a;
		this.b=b;
		this.display();
	}
	public void display() {
		System.out.println("executed successfully");
	}
	public void call() {
		System.out.println("values a & b are "+a+" "+b);
	}
}

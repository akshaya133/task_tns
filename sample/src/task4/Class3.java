package task4;

public class Class3 {
	int n=45;
	int m=67;
	Class3(){
		this.n=n;
		this.m=m;
		System.out.println("Parent constructor");
	}
	public void show() {
		System.out.println("hii from parent");
	}

}
class Child extends Class3{
	Child(){
		super();
		System.out.println("child constructor");
	}
	public void printv() {
		System.out.println("parent var are : "+n+" "+m);
		super.show();
	}
}

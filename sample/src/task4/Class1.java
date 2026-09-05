package task4;

public class Class1 {
   int p=100;
   Class1(){
	   this.p=p;
	   System.out.println("instance value "+p);
	   System.out.println("called default constructor");
   }
   public void printp() {
	   p=20;
	   System.out.println(" p value is (in local) "+ p);
   }
}

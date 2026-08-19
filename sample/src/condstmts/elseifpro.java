package condstmts;

public class elseifpro {
    int marks=49;
    public void checkgrade() {
    	if(marks<=100 && marks>=85) {
    		System.out.println("A grade");
    	}
    	else if(marks<85 && marks>=70) {
    		System.out.println("B grade");
    	}
    	else if(marks<70 && marks>=50) {
    		System.out.println("C grade");
    	}
    	else {
    		System.out.println("Fail");
    	}
    }
}

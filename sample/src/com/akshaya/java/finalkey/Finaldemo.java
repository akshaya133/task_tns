package com.akshaya.java.finalkey;

final public class Finaldemo {
	
	final int acctno=3452;
	String aname="abc";
	String bname="sbi";
	
	public Finaldemo(int acctno, String aname, String bname) {
		
		//this.acctno = acctno;
		this.aname = aname;
		this.bname = bname;
	}
	public void show() {
		System.out.println("acctno is "+acctno);
		System.out.println("acct holder name is "+aname);
		System.out.println("bank name is "+bname);
	}
	final public void rules() {
		System.out.println("if emi not paid for atleast 1 month then cibil will decrease with 5");
		System.out.println("if emi paid for 12 month then cibil will increase with 5");
	}

}

/*class Cust extends Finaldemo{
	final public void rules() {
		System.out.println("if emi not paid for atleast 1 month then cibil willnot decrease with 5");
		System.out.println("if emi paid for 12 month then cibil will increase with 5");
	}
}*/

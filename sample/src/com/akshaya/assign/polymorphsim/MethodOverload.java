package com.akshaya.assign.polymorphsim;

public class MethodOverload {
	public void display() {
		System.out.println("Hii this is methodoverloading");
		}
	public void display(int a) {
		System.out.println("a value is "+a);
		
	}
    public void display(double a,int b) {
    	System.out.println("a: "+a+" b: "+b);
    	
    }
    public void display(String s) {
    	System.out.println("the string is "+s);
    }
}

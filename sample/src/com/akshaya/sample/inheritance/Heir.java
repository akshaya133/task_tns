package com.akshaya.sample.inheritance;
import java.util.*;
class A{
	int a=10;
	int b=20;
}
class B extends A{
	public void dis() {
		System.out.println("This is B extending from A");
	System.out.println(a);
	}
}
public class Heir extends A{
	public void call() {
		System.out.println("This is Heir extending from A");
       System.out.println(b);
	}
}

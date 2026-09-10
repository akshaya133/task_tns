package com.akshaya.java.strings;

public class SBuffer_Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer a=new StringBuffer("Akshaya");
		StringBuffer a1=new StringBuffer("Akshaya");
		System.out.println(a);
		System.out.println(a.indexOf("y"));
		System.out.println(a.equals(a1));
		System.out.println(a.compareTo(a1));
		a.append(" is good");
		System.out.println(a);
		System.out.println(a.append(a1));
		
		StringBuilder b=new StringBuilder("abc");
		b.append("xyz");
		System.out.println(b);
		System.out.println(b.repeat(a1, 4));

	}

}

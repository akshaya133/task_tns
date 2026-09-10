package com.akshaya.java.strings;

public class DemoString {

	public static void main(String[] args) {
		//here the memory willnot be allocated
		String s="welcome to the world of programming";
		System.out.println(s);
		System.out.println(s.toUpperCase());
		System.out.println(s); //doesnot changed because string is immutable
		
		
		String s1=new String("Java pro"); //new space will be allocated for s1
		String s2="Java pro";
		System.out.println(s1==s2); //checks with address
		System.out.println(s1.equals(s2)); //checks with sequence of chars
		System.out.println(s1.toLowerCase());
		System.out.println(s1.charAt(5));
		System.out.println(s1.substring(0, 4));
		System.out.println(s1);
		
	}

}

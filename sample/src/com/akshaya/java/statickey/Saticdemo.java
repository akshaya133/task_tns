package com.akshaya.java.statickey;

public class Saticdemo {
	
	static String s="hii";
	int id=45;
	public static void display() {
		System.out.println("string val is "+s);
		//System.out.println(id); doesnot print because it access only static var
	}
	static {
		System.out.println("this is static block"); //firstly this block auto execute
	}

}

package com.akshaya.assign.polymorphsim;
class Parent {
	void show() {
		System.out.println("this is parent class");
	}
}
class MethodOverride extends Parent{
	public void show() {
		System.out.println("this is child class");
	}
}



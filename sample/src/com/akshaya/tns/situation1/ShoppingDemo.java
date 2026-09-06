package com.akshaya.tns.situation1;

public class ShoppingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop x=new Laptop();
		Clothing y=new Clothing();
		x.setname("Bajaj");
		x.setp(20000);
		x.setb("dell");
		x.setr(16);
		y.setsi("L");
		x.displayProductDetails();
		x.displayElectronicsDetails();
		x.displayLaptopDetails();
		y.displayClothingDetails();

	}

}

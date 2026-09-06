package com.akshaya.tns.situation1;

public class Product {
	private String productName;
	private double price;
	public void setname(String productName) {
		this.productName=productName;
	}
	public void setp(double price) {
		this.price=price;
	}
	public String getname() {
		return productName;
	}
	public double getp() {
		return price;
	}
	public void  displayProductDetails() {
		System.out.println("productname: "+productName);
		System.out.println("price: "+price);
	}
	
}
class Electronics extends Product{
	private String brand;
	public void setb(String brand) {
		this.brand=brand;
	}
	public String getb() {
		return brand;
	}
	public void displayElectronicsDetails() {
		System.out.println("brand :"+brand);
	}
	
}
class Clothing extends Product{
	private String size;
	public void setsi(String size) {
		this.size=size;
	}
	public String getsi() {
		return size;
	}
	public void displayClothingDetails() {
		System.out.println("Size :"+size);
	}
	
}
class Laptop extends Electronics{
	private int ram;
	public void setr(int ram) {
		this.ram=ram;
	}
	public int getr() {
		return ram;
	}
	public void displayLaptopDetails() {
		System.out.println("ram: "+ram);
	}
}
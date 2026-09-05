package com.akshaya.tns.situation1;

public class Person {
    private String name;
    private int age;
   /* Person(String name,int age){
    	this.name=name;
    	this.age=age;
    	displayPersonDetails(name,age);
    }*/
    public void setName(String name) {
    	this.name=name;
    }
    public void setAge(int age) {
    	this.age=age;
    }
    public String getName() {
    	return name;
    }
    public int getAge() {
    	return age;
    }
    public void displayPersonDetails() {
    	System.out.println("Person details are : name "+name+" "+"age "+age);
    }
}
class Student extends Person{
	private int rollno;
	private String course;
	/*Student(){
		super("abc",21);
		this.rollno=rollno;
		this.course=course;
		
		
	}*/
    public void setCourse(String course) {
    	this.course=course;
    }
    public void setRollno(int rollno) {
    	this.rollno=rollno;
    }
    public String getCourse() {
    	return course;
    }
    public int getRollno() {
    	return rollno;
    }
	public void displayStudentDetails() {
		System.out.println("Student details are : rollno"+rollno+" course "+course);
	}
}

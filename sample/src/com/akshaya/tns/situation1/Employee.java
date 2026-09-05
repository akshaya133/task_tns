package com.akshaya.tns.situation1;

public class Employee {
	private String name;
	private int employeeId;
	public void setName(String name) {
		this.name=name;
	}
	public void setid(int employeeId) {
		this.employeeId=employeeId;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return employeeId;
	}
	public void displayEmployeeDetails() {
	System.out.println("Employee name : "+name);
	System.out.println("EmployeeId : "+employeeId);
	}

}
 class Developer extends Employee{
	 private String programmingLanguange;
	 public void setLang(String programmingLanguange) {
			this.programmingLanguange=programmingLanguange;
		}
	 public String getLang() {
			return programmingLanguange;
		}
	 public void displayDeveloperDetails() {
			System.out.println("programmingLanguange : "+programmingLanguange);
			
			}
	 
 }
 class SeniorDeveloper extends Developer{
	 private int experience;
	 public void setexp(int experience) {
			this.experience=experience;
		}
	 public int getexp() {
			return experience;
		}
	 public void displaySeniorDetails() {
			System.out.println("experience : "+experience);
			
			}
	 
 }
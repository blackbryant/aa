package com.employ.vo;

public class Employee {
	
	private String name ;
	private String phone ; 
	private int Salary;
	private String position;
	private int insureance ;
	
	Employee(String name, int salary, int insureance){
		this.name = name ;
		this.Salary = salary ;
		this.insureance = insureance;
		
	}
	
	
	
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public int getSalary() {
		return Salary;
	}
	public String getPosition() {
		return position;
	}
	public int getInsureance() {
		return insureance;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public void setInsureance(int insureance) {
		this.insureance = insureance;
	}
	
	
	
}

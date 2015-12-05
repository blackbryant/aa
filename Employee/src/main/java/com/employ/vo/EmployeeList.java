package com.employ.vo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
	
	public static List<Employee> getEmployeeList(){
		List<Employee> list = new ArrayList<Employee>();
		Employee e1 = new Employee("Jack", 32000,1500);
		Employee e2 = new Employee("Jack", 39000,2000);
		Employee e3 = new Employee("Jack", 42000,3000);
		Employee e4 = new Employee("Jack", 50000,4000);
		
		list.add(e1) ;
		list.add(e2) ;
		list.add(e3) ;
		list.add(e4) ;
		return list ;
	}
	
	
	
	
}

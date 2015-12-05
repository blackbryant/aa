package com.application.tw;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.calcute.tool.Calcute;
import com.employ.vo.Employee;

public class CalcuteSalary {
	
	public void calSalary(){
		List<Employee> list = new ArrayList<Employee>();
		Calcute tool = new Calcute() ;
		for(Employee employee:list){
			System.out.println("Name:"+employee.getName()+",Real Salary:"+  tool.subtract(employee.getSalary(),employee.getInsureance()));
		}
	}
	
	
	
}

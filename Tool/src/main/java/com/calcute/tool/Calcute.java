package com.calcute.tool;

import java.math.BigDecimal;

public class Calcute {
	
	public int add(int a, int b){
		return a+b;
	}
	
	public int mutily(int a, int b){
		return a* b;
	}
	
	
	public BigDecimal divid(int a, int b){
		BigDecimal a1 = new BigDecimal(a) ; 
		BigDecimal a2 = new BigDecimal(b) ; 
		
		return a1.divide(a2) ;
		
	}
	
	public int subtract(int a , int b){
		return a - b;
	}
	
	
}

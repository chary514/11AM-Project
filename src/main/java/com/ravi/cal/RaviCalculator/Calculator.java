package com.ravi.cal.RaviCalculator;

import java.util.Scanner;

public class Calculator  {
	
	private long first;
	private long second;
	
	public long getFirst() {
		return first;
	}

	public void setFirst(long first) {
		this.first = first;
	}

	public long getSecond() {
		return second;
	}

	public void setSecond(long second) {
		this.second = second;
	}

	// Implement Addition Functionality  --> Assigned to Prakash
	
            public long addFunc(long first, long second){
                      return first+second;
         }	
	
	// Implement Substraction Functionality  --> Assigned to Chary
	
	
	
	// Implement Multiplication Functionality  --> Assigned to Ahmed
           
           public long subFunc(long first, long second){
                return second-first;
         }


	
	public static void main(String[] args) {
		
		System.out.println("Implmenet Calculator Functionality");
		
	}
	 

}

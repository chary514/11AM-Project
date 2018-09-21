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

	// Editing Additional Functionality  --> Assigned to Prakash
	
            public long addFunc(long first, long second){
                    return first + second;
         }	
	
	// Implement Substractional Functionality  --> Assigned to Chary
	public long subFunc(long first, long second) {
                      return second - first;
	}
	
	// Implement Multiplicational Functionality  --> Assigned to Ahmed
           
           public long mulFunc(long first, long second){
                return second * first;
         }


	
	public static void main(String[] args) {
		
		System.out.println("Calculator Functionality Completed");

		Calculator cc = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first numeric value ");
		long first = sc.nextLong();
		cc.setFirst(first);
		
		System.out.println("Enter the second numeric value ");
		long second = sc.nextLong();
		cc.setSecond(second);
		
		System.out.println("The sum of two numbers is: "+cc.addFunc(first, second));
		System.out.println("The difference of two numbers is: "+cc.subFunc(first, second));
		System.out.println("The multiples of two numbers is: "+cc.mulFunc(first, second));
		
	}
	 

}

package com.qa.Fib;

public class Fib {
	static int fib(int n) { 
//		double phi = (1 + Math.sqrt(5)) / 2; 
//		double zeta = (1 - Math.sqrt(5)) / 2;
//		return (int) ((Math.round((Math.pow(phi, n))+(Math.pow(zeta, n)))/ Math.sqrt(5))); 
//		} 
//		  
//		
		//public static void main(String[] args) { 
		         
		   // System.out.println(fib(5)); 
		   // } 
		//} 
//		int firstPosition=0;
//		int nextPosition=1;
//		for(int i=1; i<n-1;i++) {
//			int temp = firstPosition;
//			firstPosition= nextPosition;
//			nextPosition= firstPosition +temp;
//		}
//		return nextPosition;
//			
//		}
	if(n==0) {
		return 0;
	}
	else if (n==1) {
		return 1;
	}
	else {
		return fib(n-1)+fib(n-2);
	}
	}
	
public static void main(String[] args) { 
    
    System.out.println(fib(40)); 
    } 
} 




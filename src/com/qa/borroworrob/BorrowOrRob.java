package com.qa.borroworrob;

public class BorrowOrRob {
	public boolean palindrome(String sentence) {
		String sen= sentence.replace(" ", "").toLowerCase();
		String reversedstring="";
		for(int i=sen.length()-1; i>0; i--) {
			reversedstring= reversedstring + sen.charAt(i);
		}
			return sen.equals(reversedstring);
			
		}
		
		
		//ignore spaces;
		//ITERATION (for loop)
		//check for space
		//else add letter to new string
		
		
	}



package com.qa.anagram;

import java.util.Arrays;

public class Anagram {
	boolean anagrams(String a, String b) {
		boolean status = false;
		
		a=a.replace(" ","");
		b=b.replace(" ","");
//		System.out.println(a);
//		System.out.println(b);
//		

		if (a.length() != b.length()) {  
             } 
		else {  
            char[] ArrayA = a.toLowerCase().toCharArray();  
            char[] ArrayB = b.toLowerCase().toCharArray();  
            Arrays.sort(ArrayA);  
            Arrays.sort(ArrayB);  
            //System.out.println((ArrayA));
            //System.out.println((ArrayB)) 	 ;
            status = Arrays.equals(ArrayA, ArrayB);  
        }  
        return status;
    }

}

package com.qa.FizzBuzzPopSnap;

public class FizzBuzzPopSnap {
	String fizzBuzzPopSnap(int num) {
		String sen = "";
		if (num % 3 == 0) {
			sen += "Fizz";
		}
		if (num % 5 == 0) {
			sen += "Buzz";
		}
		if (num % 7 == 0) {
			sen += "Pop";
		}
		if (num % 11 == 0) {
			sen += "Snap";
		}
		return sen;
	}
	
}

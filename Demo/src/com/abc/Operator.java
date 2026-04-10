package com.abc;

public class Operator {

	public static void main(String[] args) {

		int marks = 58;

		// ternary operator

		String result = 
				(marks >= 90) ? "A Grade" : // FAIL
				(marks >= 80) ? "B Grade" : 
				(marks >= 70) ? "C Grade" : 
				(marks >= 60) ? "D Grade" : "FAIL";

		System.out.println(result);
	}
}

package com.AgeValid;

public class valid {

	public String validation(int age) {
		if(age>18) {
			return "Right to vote";
		}
		else {
			return "not eligible";
		}
	}
}

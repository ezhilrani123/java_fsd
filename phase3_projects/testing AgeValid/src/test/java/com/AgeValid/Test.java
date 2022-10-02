package com.AgeValid;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		
		valid obj=new valid();
		assertEquals("Right to vote",obj.validation(20));
	}

}

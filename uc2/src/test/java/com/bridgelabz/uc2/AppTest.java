package com.bridgelabz.uc2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {


	@Test
	public void test() {
		boolean result = App.firstName();
		assertEquals(true, result);
		
	}
	
	@Test
	public void test1() {
		boolean result = App.lastName();
		assertEquals(true, result);
		
	}
	
	
	@Test
	public void test2() {
		boolean result = App.email();
		assertEquals(true, result);
		
	}
	
	
	@Test
	public void test3() {
		boolean result = App.mobileNumber();
		assertEquals(true, result);
		
	}
	
	
	@Test
	public void test4() {
		boolean result = App.validatePassword();
		assertEquals(true, result);

	}
	
	
       }
	




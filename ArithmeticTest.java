package com.fdmgroup.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.fdmgrop.model.Arithmetic;

public class ArithmeticTest {
	
	private Arithmetic ar;
	
	@Before 
	public void beforeEachTest() {
		ar = new Arithmetic();
	}
	
	@Test
	public void test1_addMethodReturnsFiveForThreePlusTwo() {
		//Arrange
		
		
		//Act
		int result = ar.add(3,2);
		
		//Assert
		assertEquals(5, result);
		
	}
	
	@Test
	public void test2_addMethodReturnsOneForOnePlusZero() {
		//Arrange
		
		
		//Act
		int result = ar.add(1,0);
		
		//Assert
		assertEquals(1, result);
		
	}
	
	@Test
	public void test3_divideMethodReturnsTwoForFourDivideByTwo() {
		//Arrange
		
		//Act
		int result = ar.divide(4,2);
		
		//Assert
		assertEquals(2, result);
	}
	
	@Test(expected = ArithmeticException.class)
	public void test4_divideMethodReturnsForTenDivideByZero() {
		//Arrange
		
		//Act
		ar.divide(10,0);
		
		//Assert
		
	}
}

package samplefirstmavenproject.operations;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorDemoTest {

	
	@Test
	public void test1() {
		
		Calculator c1 = new Calculator();
		int actual   = c1.add(4,5);
		int expected = 9;
		
		
		Assert.assertEquals(expected, actual);
		
		
		//Assert.assertEquals(9, 0);
		
	}
	
	
	@Test
	public void test2() {
		
		Calculator c1 = new Calculator();
		int actual   = c1.add(6,4);
		int expected = 10;
		
		
		Assert.assertEquals(expected, actual);
		//Assert.assertEquals(9, 0);
		
	}
	
	@Test
	public void addMethodShouldReturn0IfBothNumbersAreNegative() {
		
		Calculator c1 = new Calculator();
		int actual   = c1.add(-6,-4);
		int expected = 0;
		//if both numbers are negative, our program should return 0
		
		Assert.assertEquals(expected, actual);
		//Assert.assertEquals(9, 0);
		
	}
	
	@Test
	public void addMethodShouldReturnProperValueIfOneOfThemIsNegative() {
		
		Calculator c1 = new Calculator();
		int actual   = c1.add(-6,2);
		int expected = -4;
		//if both numbers are negative, our program should return 0
		
		Assert.assertEquals(expected, actual);
		//Assert.assertEquals(9, 0);
		
	}
	
	@Test
	public void testTwoNumbers() {
		Calculator c1 = new Calculator();
		int actual   = c1.divide(10, 2);
		int expected = 5;
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void testTwoNumbersNew() {
		Calculator c1 = new Calculator();
		int actual   = c1.divide(20, 10);
		int expected = 2;
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void testDivisionWhenDenominatorIsZero() {
		Calculator c1 = new Calculator();
		int actual   = c1.divide(20, 0);
		int expected = 0;
		Assert.assertEquals(expected, actual);
		
	}
	
	
	
	
	
}
